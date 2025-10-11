package RequestValidationPipeline;

public class ClientRequest {
    public static void main(String[] args) {

        Validator validator = getChainOfAuth();
        validator.processRequest(Validator.AUTH, "Authenticate login....");
        validator.processRequest(Validator.DATA, "Authenticate data....");
        validator.processRequest(Validator.PERMISSION, "Authenticate roles....");
        
    }
    public static Validator getChainOfAuth(){
        Validator permissionValidator = new PermissionValidator(Validator.PERMISSION);
        Validator dataValidator = new DataValidator(Validator.DATA);
        Validator authValidator = new AuthValidator(Validator.AUTH);

        authValidator.setNextDoor(dataValidator);
        dataValidator.setNextDoor(permissionValidator);

        return authValidator;
    }
}
