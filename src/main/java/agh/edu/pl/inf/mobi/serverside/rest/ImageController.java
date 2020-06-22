package agh.edu.pl.inf.mobi.serverside.rest;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.InputStream;

@RestController
public class ImageController {
    @GetMapping(
            value = "/today_image",
            produces = MediaType.IMAGE_JPEG_VALUE
    )
    public @ResponseBody
    byte[] getTodayImage() throws IOException {
        InputStream in = new ClassPathResource("today.jpg").getInputStream();

        return in.readAllBytes();
    }

    @GetMapping(
            value = "/yesterday_image",
            produces = MediaType.IMAGE_JPEG_VALUE
    )
    public @ResponseBody
    byte[] getYesterdayImage() throws IOException {
        InputStream in = new ClassPathResource("yesterday.jpg").getInputStream();

        return in.readAllBytes();
    }

    @GetMapping(
            value = "/tomorrow_image",
            produces = MediaType.IMAGE_JPEG_VALUE
    )
    public @ResponseBody
    byte[] getTomorrowImage() throws IOException {
        InputStream in = new ClassPathResource("tomorrow.jpg").getInputStream();

        return in.readAllBytes();
    }
}
