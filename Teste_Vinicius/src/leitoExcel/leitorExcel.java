package leitoExcel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import br.com.jgm.api.io.xls.LeitorPlanilha;

public class leitorExcel {
	
	// Class fields

	private int notaFiscal;
	private int dtEmis;
	private int dataPag;
	private int CNPJ;
	private int valPag;
	private char UF;
	
	// Class Constructor
	
	public class ExcelReader extends LeitorPlanilha{
		
		

		public ExcelReader(File arquivoPlanilha) throws FileNotFoundException, IOException {
			super(arquivoPlanilha);
			
		
		}
		
	
	}
	
	
	
	

}
