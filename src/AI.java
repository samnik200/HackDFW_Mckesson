import java.util.Arrays;
import java.util.regex.Pattern;
public class AI {
    String input_patient;
    private String PossibleSymptoms[]={"headache",""};
    private String[] Symptom = input_patient.split("");
    void Symptom_Calc(String[] str)
    {
        for (int j =0;j<Symptom.length;j++)
            for (int i=0;i<Symptom.length;i++)
            {
                int test = PossibleSymptoms[j].compareToIgnoreCase(Symptom[i]);
            }

    }
}