package softwareengineering;

//public class Entity {
////	public class Entity{
//	float q;
//	 float w;
//	 float r;
//	 Entity(float q,float w,float r){
//		 this.q=q;
//		 this.w=w;
//		 this.r=r;
//	 }
//		 Vec3D intersection(Vec3D ray) {
////			 float q;
////			 float w;
////			 float r;
//			 
//			 return new Vec3D(q,w,r);
//		 }
//	}
public class Entity {

	Vec3D intersect(Vec3D ray) { return null; }

}



//	public class Sphere extends Entity{
//		float radius;
//		Vec3D centerpoint;
//		Sphere(float radius, Vec3D centerpoint){
//			this.radius=radius;
//			this.centerpoint=centerpoint;
//		}
//		Vec3D intersection(Vec3D ray){
//			float a=Math.squr(ray.x)+Math.squr(ray.y)+Math.squr(ray.z);
//			float b=2(ray.x(-centerpoint.x)+ray.y(-centerpoint.y)+ray.z(-centerpoint.z));
//			float c=Math.squr(centerpoint.x)+Math.squr(centerpoint.y)+Math.squr(centerpoint.z)-Math.squr(radius);
//			float d=Math.squr(b)-4*a*c;
//			if(d<0){
//				return null;
//			}else if(d==0){
//				float t=-b/2*a;
//				return ray.x*t, ray.y*t, ray.z*t;
//			}else{
//				float t1=(-b-Math.squr(d))/2*a;
//				float t2=(-b+Math.squr(d))/2*a;
//				return ray.x*t2, ray.y*t2, ray.z*t2;
//			}
//		}
//	}
//	public class Plane extends Entity{
//		Vec3D pointonplane;
//		Vec3D normalvector;
//		Plane(Vec3D pointonplane, Vec3D normalvector){
//	        this.pointonplane=pointonplane;
//	        this.normalvector=normalvector;
//		}
//		Vec3D intersection(Vec3D ray){
//			float a=pointonplane.x*normalvector.x+pointonplane.y*normalvector.y+pointonplane.z*normalvector.z;
//			float b=ray.x*normalvector.x+ray.y*normalvector.y+ray.z*normalvector.z;
//			if(b==0){
//				return null;
//			}else if(a==0){
//				return 0,0,0;
//			}else if(b!=0){
//				float d=a/b;
//				return d*ray.x, d*ray.y, d*ray.z;
//			}
//		}
	


