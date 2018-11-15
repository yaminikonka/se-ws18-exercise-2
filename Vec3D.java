package softwareengineering;
class Vec3D {

	public float x,y,z;
	Vec3D( float _x, float _y, float _z ) { x = _x; y =_y; z = _z; }

	Vec3D( String _s ) {
		String[] items = _s.split("\\s+");
		x = Float.parseFloat(items[1]);
		y = Float.parseFloat(items[2]);
		z = Float.parseFloat(items[3]);
	}
	public String toString() { return "[ " + x + " " + y + " " + z + " ]"; }

//public class Vector3D{
//	double x;
//	double y;
//	double z;
//	Vector3D(double x,double y,double z){
//		this.x=x;
//		this.y=y;
//		this.z=z;
//	}
	Vec3D add( Vec3D other ) { return new Vec3D( x+other.x, y+other.y, z+other.z ); }
	Vec3D sub( Vec3D other ) { return new Vec3D( x-other.x, y-other.y, z-other.z ); }

	Vec3D mul( float other ) { return new Vec3D( x*other, y*other, z*other ); }
	float mul( Vec3D other ) { return x*other.x + y*other.y + z*other.z; }
	 float length(){
		float len=(float)(Math.sqrt(Math.pow(x,2)+Math.pow(y,2)+Math.pow(z,2)));
//		float len=new float(Math.sqrt(x^2+y^2+z^2));
		return len;
	}
	 Vec3D cross(Vec3D others){
		 float a=(y*others.z)-(z*others.y);
		 float b=(z*others.x)-(x*others.z);
		 float c=(x*others.y)-(y*others.x);
		 return new Vec3D(a,b,c);
//          return new  Vec3D(y*other.z-z*other.y, z*other.x-x*other.z, x*other.y-y*other.x);
		 
	}
}


