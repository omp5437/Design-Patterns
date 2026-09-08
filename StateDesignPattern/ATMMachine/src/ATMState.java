public interface ATMState {
  String getCurrentState();
  void insertCard();
  void enterPin();
  void verifyPin(String verify);
  void withDraw(double amount);
  void checkBalance();
  void ejectCard();


}
