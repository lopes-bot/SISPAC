package migrates;
import br.com.migratesDrops.*;
public class MigrateDown {
	private String sqlDrop = "DROP TABLE evento";
	//Admin002 adm = new Admin002();
	//Aluno002 alu = new Aluno002();
	Evento002 ev = new Evento002(sqlDrop);
}
