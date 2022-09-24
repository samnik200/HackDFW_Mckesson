import java.util.Arrays;
import java.util.regex.Pattern;
public class AI {
    String input_patient;
    private int test;
    private int i;
    private int j;
    private int [] indx;
    private int secondary=0;
    private String PossibleSymptoms[]={"headache","pain", "urination","bumps", "genitals" , "coughing", "soar", "throat", "rashes", "diarrhea", "vomiting", "runny", "nose"};
    private String[] Symptom = input_patient.split("");
    void Symptom_Calc(String[] str)
    {
        for (j =0;j<Symptom.length;j++)
            if ( test ==0)
            {
                indx[secondary]=j;
            }
            for (i=0;i<Symptom.length;i++)
            {
                 test = PossibleSymptoms[j].compareToIgnoreCase(Symptom[i]);
            }


    }
}