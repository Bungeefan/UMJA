package umja;

import java.util.List;
import java.util.Objects;

public class UMLClazz {

    private String id;
    private String strPackage;
    private String clazzName;
    private ClassType classType;
    private String inheritsFrom;
    private List<String> interfaces;
    private List<UMLClazzProperty> properties;
    private List<UMLClazzMethod> methods;

    public UMLClazz(String id, String strPackage, String clazzName, ClassType classType, String inheritsFrom, List<String> interfaces, List<UMLClazzProperty> properties, List<UMLClazzMethod> methods) {
        this.id = id;
        this.strPackage = strPackage;
        this.clazzName = clazzName;
        this.classType = classType;
        this.inheritsFrom = inheritsFrom;
        this.interfaces = interfaces;
        this.properties = properties;
        this.methods = methods;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPackage() {
        return strPackage;
    }

    public String getClazzName() {
        return clazzName;
    }

    public ClassType getClassType() {
        return classType;
    }

    public List<UMLClazzProperty> getProperties() {
        return properties;
    }

    public List<UMLClazzMethod> getMethods() {
        return methods;
    }

    public String getInheritsFrom() {
        return inheritsFrom;
    }

    public List<String> getInterfaces() {
        return interfaces;
    }

    @Override
    public String toString() {
        return "UMLClazz{" +
                "id='" + id + '\'' +
                "strPackage='" + strPackage + '\'' +
                ", clazzName='" + clazzName + '\'' +
                ", classType=" + classType +
                ", inheritsFrom='" + inheritsFrom + '\'' +
                ", interfaces=" + interfaces +
                ", properties=" + properties +
                ", methods=" + methods +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UMLClazz umlClazz = (UMLClazz) o;
        return Objects.equals(id, umlClazz.id) &&
                Objects.equals(strPackage, umlClazz.strPackage) &&
                Objects.equals(clazzName, umlClazz.clazzName) &&
                classType == umlClazz.classType &&
                Objects.equals(inheritsFrom, umlClazz.inheritsFrom) &&
                Objects.equals(interfaces, umlClazz.interfaces) &&
                Objects.equals(properties, umlClazz.properties) &&
                Objects.equals(methods, umlClazz.methods);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, strPackage, clazzName, classType, inheritsFrom, interfaces, properties, methods);
    }

    public enum ClassType {
        INTERFACE, ENUM, ABSTRACT, CLASS
    }
}
