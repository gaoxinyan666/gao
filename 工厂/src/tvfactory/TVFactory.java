package tvfactory;
import tv.*;
public interface TVFactory {
	public static Tv produceTv(String brand){
		if(brand.equals("HaierTv"))
		return new haierTv();
if(brand.equals("HisenseTv"))
		return new HisenseTv();
return null;
}

}
