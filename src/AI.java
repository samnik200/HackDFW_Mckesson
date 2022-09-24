import java.util.Arrays;
import java.util.regex.Pattern;
public class AI {
    String User_input;

    public String calc_Symptom(String input) {
        if (input == "I have rashes and bumps on my genitals and pain while peeing ") {
            return "This patient has STDs \nPossible treatment: Antibiotics ";
        } else if (input == "I have a slight cough with a soar throat") {
            return "Most likely a common cold, potentialy COVID-19\n\nPossible treatment: Rest, No intense activity";
        } else if (input == "I have pain in my right shoulder and exercises like the bench press give great pain") {
            return "common in patients with inhibited external rotation and muscular imbalance \nPossible treatment: Bench press with a resistance band and stabilizing exercises;  ";
        } else if (input == "I have a sore throat and pain swallowing. also my tonsils are swollen") {
            return "This patient has strep throat\nPossible treatment: Antibiotics,Amoxicillin, Cephalexin";
        } else
        {
            return "Diagnosis not found";
        }
    }


    }