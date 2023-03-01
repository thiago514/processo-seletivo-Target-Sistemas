package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import objects.DiaDistribuidora;
public class Main {

	public static void main(String[] args) throws FileNotFoundException {
			File dadosJson = new File("/home/thiago/eclipse-workspace/FaturamentoDistribuidora/dados.json");
			Scanner sc = new Scanner(dadosJson);
			String json = "";
			double total = 0, menorValor = Double.MAX_VALUE, maiorValor = Double.MIN_VALUE, media;
			int diasUteis = 0, NdiasMaiorQueAMedia = 0;
			List<DiaDistribuidora> list = new ArrayList<>();
			
			while(sc.hasNext()) {
				json += sc.next();
			}

			String[] jsonDays = json.split("\\{");
			
			for(int i = 1; i < jsonDays.length; i++) {
				String dia = jsonDays[i].substring(jsonDays[i].indexOf("dia") + 5, jsonDays[i].indexOf(","));
				String faturamento = jsonDays[i].substring(jsonDays[i].indexOf("valor") + 8, jsonDays[i].indexOf("}"));
				list.add(new DiaDistribuidora(Integer.parseInt(dia), Double.parseDouble(faturamento)));
			}

			for(DiaDistribuidora d : list){
				total += d.faturamento();
				if(d.faturamento() > maiorValor)maiorValor = d.faturamento();
				if(d.faturamento()>0) {
					diasUteis++;
					if(d.faturamento() < menorValor)menorValor = d.faturamento();
				}
			}
			
			media = total/diasUteis;
			
			for(DiaDistribuidora d : list){
				if(d.faturamento() > media)NdiasMaiorQueAMedia++;
			}
			
			System.out.println("O menor valor de faturamento ocorrido foi R$" + menorValor);
			System.out.println("O maior valor de faturamento ocorrido R$" + maiorValor);
			System.out.println("Número de dias no mês em que o valor de faturamento diário foi superior à média mensal é de " + NdiasMaiorQueAMedia);
			
			sc.close();


	}

}
