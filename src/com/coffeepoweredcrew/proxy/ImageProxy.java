package com.coffeepoweredcrew.proxy;

//Proxy class.
public class ImageProxy implements Image {

	private String name;
	private BitmapImage image;
	private Point2D location;

	public ImageProxy(String name) {
		this.name = name;
	}

	@Override
	public void setLocation(Point2D point2d) {
		// TODO Auto-generated method stub
		if (image != null) {
			image.setLocation(point2d);
		} else {
			this.location = point2d;
		}
	}

	@Override
	public Point2D getLocation() {
		// TODO Auto-generated method stub
		if (image != null) {
			return image.getLocation();
		}
		return location;
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub
		if (image == null) {
			image = new BitmapImage(name);
			if (location != null) {
				image.setLocation(location);
			}
		}
		image.render();
	}

}
