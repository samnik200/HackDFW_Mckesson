import java.util.Arrays;
import java.util.regex.Pattern;
public class AI {
    String input_patient;
    private int test;
    private int i;
    private int j;
    private int [] indx;
    private int secondary=0;
    private String PossibleSymptoms[]={"__","headache1","pain2", "urination3","bumps4", "genitals5" , "coughing6", "soar throat7",  "rashes8", "diarrhea9", "vomiting10", "runny11", "nose12","fever13","tonsils14","swollen15","red16"};
    private String[] Symptom = input_patient.split("");
    public String Symptom_Calc(String[] str)
    {
        for (j =0;j<Symptom.length;j++)
            if ( test ==0)
            {
                indx[secondary]=j;
                secondary++;
            }
            for (i=0;i<Symptom.length;i++)
            {
                 test = PossibleSymptoms[j].compareToIgnoreCase(Symptom[i]);
            }
        int numberConverted = 0;
        for (int number : indx) {
            numberConverted = 10*numberConverted + number;
        }

        if (numberConverted == 16)
        {
            return "Common cold, possibly COVID 19";
        }
        else if(numberConverted == 2345)
        {
            return "STD with 95% certainty";
        }
        else if (numberConverted== 16791013
        else
        {

        }



    }
}