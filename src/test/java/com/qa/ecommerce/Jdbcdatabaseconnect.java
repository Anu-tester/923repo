package com.qa.ecommerce;

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

import java.sql.ResultSet;

import java.sql.Statement;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jdbcdatabaseconnect {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		// TODO Auto-generated method stub

		String host = "localhost";

		String port = "3306";

		Connection con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/selqa", "root", "root");

		Statement s = con.createStatement();

		ResultSet rs = s.executeQuery("select * from logintable");

		while (rs.next())

		{

			System.setProperty("webdriver.chrome.driver", "c://chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.ebay.com/");
			driver.findElement(By.xpath("//*[@id='gh-ug']/a")).click();
			driver.findElement(By.xpath("//*[@id='userid']")).clear();
			driver.findElement(By.xpath("//*[@id='userid']")).sendKeys(rs.getString("id"));
			driver.findElement(By.xpath("//*[@id=\'pass\']")).clear();
			driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("password");
			driver.close();

		}

	}

}
