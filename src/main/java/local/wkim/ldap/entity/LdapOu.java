package local.wkim.ldap.entity;

import org.springframework.ldap.odm.annotations.Entry;

@Entry(objectClasses = {"organizationalUnit", "top"})
public class LdapOu extends LdapEntity{

}
