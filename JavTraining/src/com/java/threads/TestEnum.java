package com.java.threads;

public interface TestEnum {
	
    public String CALLER_NAME_PERSON = "CallerNamePerson";
    public String CALLER_NAME_CONTACT = "CallerNameContact";
    public String NO_SECURITY_DEFINED = "NoSecurityDefined";
    


    public enum Security {

        MANAGE_PHONE("PER_MANAGE_PERSON_PHONES_DATA",
                     "PER_MANAGE_PERSON_CONTACT_DETAILS_DATA"),
        MANAGE_EMAIL("PER_MANAGE_PERSON_EMAIL_DATA",
                     "PER_MANAGE_PERSON_CONTACT_DETAILS_DATA"),
        MANAGE_OTHER_COMM("PER_MANAGE_PERSON_COMMUNICATION_METHOD_DATA",
                          "PER_MANAGE_PERSON_CONTACT_DETAILS_DATA"),
        MANAGE_ADDRESS("PER_MANAGE_PERSON_PRIVATE_ADDRESS_DETAILS_DATA",
                       NO_SECURITY_DEFINED),
        MANAGE_NATIONAL_IDENT(NO_SECURITY_DEFINED,
                              "PER_MANAGE_PERSON_CONTACT_DETAILS_DATA"),
        MANAGE_CITIZENSHIP(NO_SECURITY_DEFINED, NO_SECURITY_DEFINED),
        MANAGE_DRIVERS_LICENSE("PER_MANAGE_PERSON_DRIVER_LICENSE_DATA",
                               NO_SECURITY_DEFINED),
        MANAGE_PASSPORT("PER_MANAGE_PERSON_PASSPORT_DATA",
                        NO_SECURITY_DEFINED),
        MANAGE_VISA_PERMIT("PER_MANAGE_PERSON_VISA_OR_PERMIT_DATA",
                           NO_SECURITY_DEFINED);
    	
        private String personPrevligeName;
        private String contactPrevligeName;


        Security(String personPrevlige, String contactPrevlige) {

            this.personPrevligeName = personPrevlige;
            this.contactPrevligeName = contactPrevlige;
        }
    }
    
    
}
