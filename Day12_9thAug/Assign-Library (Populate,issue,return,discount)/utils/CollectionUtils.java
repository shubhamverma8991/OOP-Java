package utils;

import java.text.ParseException;
import java.util.ArrayList;
import static com.app.core.Category.*;
import static com.app.core.Library.sdf;
import com.app.core.Library;

public class CollectionUtils {

	public static ArrayList<Library> populatelibrary()throws ParseException
	{
		ArrayList<Library> list = new ArrayList<>();
		list.add(new Library(1122334455,"ChetanBhagat",500,DRAMA,15,sdf.parse("01-02-1996")));
		list.add(new Library(1122776655,"NiloptalMrinal",700,FICTIONAL,25,sdf.parse("01-05-2001")));
		list.add(new Library(1199874455,"Jules Verne",5000,SCIFI,20,sdf.parse("01-02-1886")));
		list.add(new Library(1122334455,"Robin Sharma",400,FICTIONAL,5,sdf.parse("01-08-2000")));
		list.add(new Library(1122334455,"Harivansh Rai Bachchan",500,POETRY,50,sdf.parse("01-01-1995")));

		return list;
	}
}
