package repaso;

import java.io.*;

public class ex1049_Animal
{
		public static void main(String args[])
		{
				BufferedReader br =  new BufferedReader ( new InputStreamReader (System.in));
				BufferedWriter bw =  new BufferedWriter ( new OutputStreamWriter (System.out));
				
					
				try
				{
						String[] words = new String[3];
					
						words[0] = br.readLine();
						words[1] = br.readLine();
						words[2] = br.readLine();
						
						
						if(words[0].equals("vertebrado"))
						{
								if(words[1].equals("ave"))
								{
										if(words[2].equals("carnivoro"))
										{
												bw.write("aguila");
										}
										else
										{
												bw.write("pomba");
										}
								}
								else
								{
										if(words[2].equals("onivoro"))
										{
												bw.write("homen");
										}
										else
										{
												bw.write("vaca");
										}
								}
						}
						else
						{
								if(words[1].equals("insecto"))
								{
										if(words[2].equals("hematofago"))
										{
												bw.write("pulga");
										}
										else
										{
												bw.write("lagarto");
										}
								}
								else
								{
										if(words[2].equals("hematofago"))
										{
												bw.write("sanguessuga");
										}
										else
										{
												bw.write("minhoca");
										}
								}
						}
					
						bw.write("\n");
						bw.flush();
						
						br.close();
		}		
				catch (Exception e)
				{
						e.printStackTrace();
				}
		}
	
}