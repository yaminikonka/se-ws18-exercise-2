package softwareengineering;

//public class Plane {
	public class Plane extends Entity{
		Vec3D pointonplane;
		Vec3D normalvector;
		Plane(Vec3D pointonplane, Vec3D normalvector){
	        this.pointonplane=pointonplane;
	        this.normalvector=normalvector;
		}
//		Vec3D intersect(Vec3D ray) {
		Vec3D intersect(Vec3D ray) {
			float a=pointonplane.x*normalvector.x+pointonplane.y*normalvector.y+pointonplane.z*normalvector.z;
			float b=ray.x*normalvector.x+ray.y*normalvector.y+ray.z*normalvector.z;
			if(b==0){
				return null;
			}else if(a==0){
				float s=0;
				float n=0;
				float y=0;
				return new Vec3D(s,n,y);
//			}else if(b!=0){
			}else {
				float d=a/b;
				float i=d*ray.x;
				float j=d*ray.y;
				float k=d*ray.z;
//				return d*ray.x, d*ray.y, d*ray.z;
				return new Vec3D(i,j,k);
			}
		
		}

}
