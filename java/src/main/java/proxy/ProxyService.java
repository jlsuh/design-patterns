package main.java.proxy;

public class ProxyService implements ServiceInterface {
    private RealService realService;

    public ProxyService(RealService realService) {
        this.realService = realService;
    }

    private boolean hasAccess() {
        return true; // Una lógica no tan trivial
    }

    @Override
    public void operation() {
        if (this.hasAccess()) {
            this.realService.operation();
            System.out.println("Operación posta posta invocada");
        }
    }
}
