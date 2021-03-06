/**
 * Created by Nadezhda.Burnasheva on 3/9/2016.
 */
public class Main {

    public static void main(String [] args){

        String configDir = System.getProperty("teamcity.runAs.configDir");
        if (configDir != null){
            System.out.println(configDir);
        } else {
            System.out.println("System property teamcity.runAs.configDir == null");
        }

        String profileId = System.getProperty("teamcity.runAs.profileId");
        if (profileId != null){
            System.out.println(profileId);
        } else {
            System.out.println("System property teamcity.runAs.profileId == null");
        }

        String configDirEnv = System.getenv("teamcity.runAs.configDir");
        if (configDirEnv != null){
            System.out.println(configDirEnv);
        } else {
            System.out.println("System property teamcity.runAs.configDir == null");
        }

        String profileIdEnv = System.getenv("teamcity.runAs.profileId");
        if (profileIdEnv != null){
            System.out.println(profileIdEnv);
        } else {
            System.out.println("System property teamcity.runAs.profileId == null");
        }

    }
}
