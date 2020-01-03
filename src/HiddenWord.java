import java.util.scanner;

public class HiddenWord{
  private string answer;

public HiddenWord(String answer) {
    this.answer = answer;
  }


public String getHint(String guess) {
  String hint = "";

 for (int i=0; i < guess.length(); i++) {

   if (correctOrder(i, guess)) {

     hit += answer.substring(i, i+1);

   } else if ((stringContains(i, guess)) && (!(correctOrder(i, guess)))) {

     hint += "+";

   } else {

     hint += "*";

   }
 }
 return hint;
}


public boolean correctOrder(int i, String guess) {
  if (guess.substring(i, i+1).equals(answer.substring(i, i+1))) {

    return true;

} else {

  return false;

 }
}


public boolean stringContains(int i, String guess){

  int check = 0;

  for (int x = 0; x < guess.length(); x++ ) {

    if (guess.substring(i, i+1).equals(answer.substring(x, x+1))) {

      check = 1;
      return true;
    }
  }

if (check == 1) {

  return true;

} else {

  return false;

 }
}
}
