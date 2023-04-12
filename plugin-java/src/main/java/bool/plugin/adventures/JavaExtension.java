package bool.plugin.adventures;

public abstract class JavaExtension {
    public Boolean isNotJavaBean = Boolean.TRUE;

    public Boolean javaBean = Boolean.TRUE;

    public Boolean isMethodNotJavaBean() { return Boolean.TRUE; }
    public void setMethodNotJavaBean(Boolean x) {  }

    public Boolean getMethodJavaBean() { return Boolean.TRUE; }
    public void setMethodJavaBean(Boolean x) { }
}
