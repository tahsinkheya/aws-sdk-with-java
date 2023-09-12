package awsJava;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.client.builder.AwsClientBuilder;
import com.amazonaws.auth.AWSStaticCredentialsProvider;

public class connectS3 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		String awsAccessKeyId = "YOUR_ACCESS_KEY_ID";
        String awsSecretAccessKey = "YOUR_SECRET_ACCESS_KEY";
        String endpointUrl = "YOUR_S3_ENDPOINT_URL";

        BasicAWSCredentials credentials = new BasicAWSCredentials(awsAccessKeyId, awsSecretAccessKey);

        AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
                .withEndpointConfiguration(new AwsClientBuilder.EndpointConfiguration(endpointUrl, "us-east-1")) // Replace "us-east-1" with your desired region
                .withCredentials(new AWSStaticCredentialsProvider(credentials))
                .build();

        // Create a new S3 bucket folder (replace "your-bucket-name" and "your-folder-name" with your desired names)
        s3Client.createFolder("your-bucket-name", "your-folder-name");

        System.out.println("Folder created successfully.");

	}

}



