package org.dyn4j;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;

import org.dyn4j.dynamics.Body;
import org.dyn4j.dynamics.BodyFixture;
import org.dyn4j.Graphics2DRenderer;
import org.dyn4j.geometry.Convex;

public class SimulationBody extends Body 
{
	/** The color of the object */
	protected Color color;
	
	/**
	 * Default constructor.
	 */
	public SimulationBody() 
	{
		// randomly generate the color
		this.color = new Color((float)Math.random() * 0.5f + 0.5f, (float)Math.random() * 0.5f + 0.5f, (float)Math.random() * 0.5f + 0.5f);
	}
	
	/**
	 * Constructor.
	 * @param color a set color
	 */
	public SimulationBody(Color color)
	{
		this.color = color;
	}

	/**
	 * Draws the body.
	 * <p>
	 * Only coded for polygons and circles.
	 * @param g the graphics object to render to
	 * @param scale the scaling factor
	 */
	public void render(Graphics2D g, double scale) 
	{
		this.render(g, scale, this.color);
	}
	
	/**
	 * Draws the body.
	 * <p>
	 * Only coded for polygons and circles.
	 * @param g the graphics object to render to
	 * @param scale the scaling factor
	 * @param color the color to render the body
	 */
	public void render(Graphics2D g, double scale, Color color) 
	{
		// point radius
		final int pr = 4;
		
		// save the original transform
		AffineTransform ot = g.getTransform();
		
		// transform the coordinate system from world coordinates to local coordinates
		AffineTransform lt = new AffineTransform();
		lt.translate(this.transform.getTranslationX() * scale, this.transform.getTranslationY() * scale);
		lt.rotate(this.transform.getRotation());
		
		// apply the transform
		g.transform(lt);
		
		// loop over all the body fixtures for this body
		for (BodyFixture fixture : this.fixtures)
		{
			this.renderFixture(g, scale, fixture, color);
		}
	
		// set the original transform
		g.setTransform(ot);
	}
	
	/**
	 * Renders the given fixture.
	 * @param g the graphics object to render to
	 * @param scale the scaling factor
	 * @param fixture the fixture to render
	 * @param color the color to render the fixture
	 */
	protected void renderFixture(Graphics2D g, double scale, BodyFixture fixture, Color color)
	{
		// get the shape on the fixture
		Convex convex = fixture.getShape();
		
		// brighten the color if asleep
		if (this.isAsleep()) 
		{
			color = color.brighter();
		}
		// render the fixture
		Graphics2DRenderer.render(g, convex, scale, color);
	}
}
