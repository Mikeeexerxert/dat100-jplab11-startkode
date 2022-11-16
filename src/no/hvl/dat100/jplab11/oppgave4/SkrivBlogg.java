package no.hvl.dat100.jplab11.oppgave4;
import no.hvl.dat100.jplab11.oppgave3.Blogg;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class SkrivBlogg {
	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		try {
			PrintWriter pw = new PrintWriter(mappe + filnavn);
			pw.write(samling.toString());
			pw.flush();
			pw.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("File not Found");
		}
		return true;
	}
}
