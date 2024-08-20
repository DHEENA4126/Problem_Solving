package Zoho;

public class emailmask {

        public static void main(String[] args) {
            String email = "dheena4126@gmail.com";
            String maskedEmail = maskEmail(email);
            System.out.println(maskedEmail);  // Output: dh******6@g***l.c*m
        }

        public static String maskEmail(String email) {
            String[] parts = email.split("@");
            String localPart = parts[0];
            String domainPart = parts[1];

            String maskedLocalPart = localPart.charAt(0) + "******" + localPart.charAt(localPart.length() - 1);

            String[] domainParts = domainPart.split("\\.");
            String maskedDomainPart = domainParts[0].charAt(0) + "***" + domainParts[0].charAt(domainParts[0].length() - 1)
                    + "." + domainParts[1].charAt(0) + "*" + domainParts[1].charAt(domainParts[1].length() - 1);

            return maskedLocalPart + "@" + maskedDomainPart;
        }
    }


