package softwareengineering;

//public class Sphere {
	public class Sphere extends Entity{
		float radius;
		Vec3D centerpoint;
//		float radius;
		Sphere(Vec3D centerpoint, float radius){
			this.radius=radius;
			this.centerpoint=centerpoint;
		}
		Vec3D intersect(Vec3D ray){
			float a=(float) (Math.pow(ray.x,2)+Math.pow(ray.y,2)+Math.pow(ray.z,2));
			float b=2*( ray.x*(-centerpoint.x)+ray.y*(-centerpoint.y)+ray.z*(-centerpoint.z));
			float c=(float) (Math.pow(centerpoint.x,2)+Math.pow(centerpoint.y,2)+Math.pow(centerpoint.z,2)-Math.pow(radius,2));
			float d=(float) Math.pow(b,2)-4*a*c;
			if(d<0){
				return null;
			}else if(d==0){
				float t=-b/2*a;
			    float q=ray.x*t;
				float w=ray.y*t;
			    float r=ray.z*t;
//				return ray.x*t, ray.y*t, ray.z*t;
				return new Vec3D(q,w,r);
			}else{
				float t1=(float) ((-b-Math.sqrt(d))/2*a);
				float t2=(float) ((-b+Math.sqrt(d))/2*a);
//				float s=Math.sqrt(Math.)
				float k=ray.x*t1;
				float l=ray.y*t1;
				float m=ray.z*t1;
				float d1=(float) Math.sqrt(Math.pow(k, 2)+Math.pow(l, 2)+Math.pow(m, 2));
				float x1=ray.x*t2;
				float x2=ray.y*t2;
				float x3=ray.z*t2;
				float d2=(float) Math.sqrt(Math.pow(x1, 2)+Math.pow(x2, 2)+Math.pow(x3, 2));
				if(d1<d2) {
					return new Vec3D(k,l,m);
				}else {
					return new Vec3D(x1,x2,x3);
				}
//				return ray.x*t2, ray.y*t2, ray.z*t2;
//				return new Vec3D(k,l,m);
			}
		}
	}


