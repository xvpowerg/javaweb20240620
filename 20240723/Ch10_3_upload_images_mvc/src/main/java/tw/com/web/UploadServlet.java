package tw.com.web;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import tw.com.tools.ImageTools;


@MultipartConfig
@WebServlet("/update")
public class UploadServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req,
			HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Part part =  req.getPart("photo");
		String fileName =  part.getSubmittedFileName();
		ImageTools.updateFile(part.getInputStream(), fileName);

		resp.sendRedirect("view_images");
		
	}
}
