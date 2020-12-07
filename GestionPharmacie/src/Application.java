import java.util.*;

public class Application {

	public static void main(String[] args) {


		Scanner scan= new Scanner(System.in);
		ArrayList<Pharmacien> ListPharmacien= new ArrayList<Pharmacien>();
		ArrayList<Medicament> ListMedicament = new ArrayList<Medicament>();
		ArrayList<Client> ListClient = new ArrayList<Client>();
		String Nom,prenom,email,telephone,description,prix;
		int badge =0;
		Nom=prenom=email=telephone=description=prix="";

		int id;
		Pharmacien pharmcn = new Pharmacien();
		Medicament mdcmnt = new Medicament();
		Client Clnt = new Client();
		
		while(true) {
			System.out.println(" côté Pharmacien : 1 \n côté client     : 2");
			String method1=scan.next();
			//String method2=scan.next();
			String choix1="";
			String choix2="";
			switch(method1) {
				//côté Pharmacien
				case "1" :
					System.out.println("côté Pharmacien \n Gestion Pharmacien : 1 \n Gestion Medicament : 2");
					String method2=scan.next();
					//String choix1="";
					switch(method2) {
						//mm
						//Gestion Pharmacien
						case "1":
					 		System.out.println("Gestion Pharmacien \n  pour  ajouter Pharmacien        -> 1 \n  pour  modifier Pharmacien       -> 2 \n  pour  supprimer Pharmacien      -> 3 \n  pour  Rechercher un Pharmacien  -> 4");           
						    choix1= scan.next();
						    switch(choix1) {
						    	//ajouter Pharmacien
						    	case "1":
						    		 System.out.println("entrer le Nom de Pharmacien");
									 Nom= scan.next();
									 System.out.println("entrer le Prenom de Pharmacien");
									 prenom= scan.next();
									 System.out.println("entrer le Telephone de Pharmacien");
									 telephone= scan.next();
									 System.out.println("entrer le Email de Pharmacien");
									 email= scan.next();
									 pharmcn=  new Pharmacien(Nom,prenom,telephone,email);
									 pharmcn.AjouterePharmacien(pharmcn, ListPharmacien);
									 break;
									
								//modifier Pharmacien
						    	case "2":
						    		if(ListPharmacien.size()>0) {
						    			System.out.println("les Pharmacien  : \n " + ListPharmacien); 
						    			System.out.println("entrer l id quel dois modifier ");
						  				id= scan.nextInt();
						  				System.out.println("entrer le Nom de  Pharmacien");
										Nom= scan.next();
										System.out.println("entrer le prenom de  Pharmacien");
										prenom= scan.next();
										System.out.println("entrer le Telephone de  Pharmacien");
										telephone= scan.next();
										System.out.println("entrer le Email de  etudient");
										email= scan.next();
										//appel method modifierEtudient
										pharmcn.modifierPharmacien(ListPharmacien, id, Nom,prenom,telephone,email);
						  		  		System.out.println(" PharmacienS " + ListPharmacien);
						    			
						    		}else {
				  						System.out.println("PharmacienS vide Ajouter des PharmacienS");
				  					}
						    		break;
						    		
					    		//supprimer Pharmacien
						    	case "3":
						    		if(ListPharmacien.size()>0) {
				  			  			System.out.println("les Pharmacien  : \n " + ListPharmacien); 
				  			  			System.out.println("entrer l id quel dois supprimer ");
				  			  			id= scan.nextInt();
				  			  			
				  			  			pharmcn.supprimerPharmacien(ListPharmacien,id);
				  			  		}else {
				  			  			System.out.println("Pharmacien vide Ajouter des Pharmaciens");
				  			  		}
				  					break;
				  				//cherche Pharmacien
						    	case "4":
						    		if(ListPharmacien.size()>0) {
						    			System.out.println("les Medicaments  : \n " + ListPharmacien); 
						    			System.out.println("entrer l id quel dois cherche ");
						  				id= scan.nextInt();
						  				
										//appel method chercheMedicament
						  				pharmcn.cherchepharmacien(ListPharmacien, id);						    			
						    		}else {
				  						System.out.println("Medicaments vide Ajouter des Medicaments");
				  					}
						    		break;
						    	default:

						    }
					 		
					 		break;
					 		
					 	//Gestion Medicament
						case "2" :
					 		System.out.println("Gestion Medicament \n  pour  ajouter Medicament       -> 1 \n  pour  modifier Medicament      -> 2 \n  pour  supprimer Medicament     -> 3 \n  pour  Rechercher un médicament -> 4");  
					 																																									 
						    choix1= scan.next();
						    switch(choix1) {
						    	//jouter Medicament
						    	case "1":
						    		 System.out.println("entrer le Nom de Medicament");
									 Nom= scan.next();
									 System.out.println("entrer le Description de Medicament");
									 description= scan.next();
									 System.out.println("entrer le Prix de Medicament");
									 prix= scan.next();
									 
									 mdcmnt =  new Medicament(Nom,description,prix);
									 mdcmnt.AjoutereMedicament(mdcmnt, ListMedicament);
									 break;
									 
								//modifier Medicament
						    	case "2":
						    		if(ListMedicament.size()>0) {
						    			System.out.println("les Pharmacien  : \n " + ListMedicament); 
						    			System.out.println("entrer l id quel dois modifier ");
						  				id= scan.nextInt();
						  				System.out.println("entrer le Nom de  Medicament");
										Nom= scan.next();
										System.out.println("entrer le Description de  Medicament");
										description= scan.next();
										System.out.println("entrer le Prix de  Medicament");
										prix= scan.next();
										//appel method modifierEtudient
										mdcmnt.modifierMedicament(ListMedicament, id, Nom,description,prix);
						  		  		System.out.println(" Medicaments " + ListMedicament);
						    			
						    		}else {
				  						System.out.println("Medicaments vide Ajouter des Medicaments");
				  					}
						    		break;
						    		
						    	//supprimer Medicament
						    	case "3":
						    		if(ListMedicament.size()>0) {
				  			  			System.out.println("les Medicament  : \n " + ListMedicament); 
				  			  			System.out.println("entrer l id quel dois supprimer ");
				  			  			id= scan.nextInt();
				  			  			
				  			  			mdcmnt.supprimerMedicament(ListMedicament,id);
				  			  		}else {
				  			  			System.out.println("Pharmacien vide Ajouter des Pharmaciens");
				  			  		}
				  					break;
				  					
				  				//cherche Medicament
						    	case "4":
						    		if(ListMedicament.size()>0) {
						    			System.out.println("les Medicaments  : \n " + ListMedicament); 
						    			System.out.println("entrer l id quel dois cherche ");
						  				id= scan.nextInt();
						  				
										//appel method chercheMedicament
										mdcmnt.chercheMedicament(ListMedicament, id);						    			
						    		}else {
				  						System.out.println("Medicaments vide Ajouter des Medicaments");
				  					}
						    		break;
						    	default:
						    }
					 		
					 		break;
					 	
						//MM
					}
					break;
				//côté Client
				case "2" :
					System.out.println(" côté Client \n les Medicament  : \n " + ListMedicament + "\n Cherche une Medicament   -> 1 \n");
					choix1= scan.next();
					switch (choix1) {
						case "1":
							if(ListMedicament.size()>0) {
				    			System.out.println("les Medicaments  : \n " + ListMedicament); 
				    			System.out.println("entrer l id quel dois cherche ");
				  				id= scan.nextInt();
				  				
								//appel method chercheMedicament
								mdcmnt.chercheMedicament(ListMedicament, id);
								int check = mdcmnt.checkMedicamentIfExist(ListMedicament, id); 
								if (check ==  1) {
									System.out.println(" Pour counfermer lachat clik 1");
									choix2= scan.next();
									switch (choix1) {
										case "1":
											 // add info client
											 System.out.println("entrer le Nom de Client");
											 Nom= scan.next();
											 System.out.println("entrer le Prenom de Client");
											 prenom= scan.next();
											 System.out.println("entrer le Email de Client");
											 email= scan.next();
											 System.out.println("entrer le Telephone de Client");
											 telephone= scan.next();
											 badge = 1;
											 
											 int bdg = 0;
											 for(int j=0;j<ListClient.size();j++) {
												if(Nom.equals(ListClient.get(j).getNom())     ) {
													System.out.println("\n Wolcam " + Nom);
													bdg = ListClient.get(j).getBadge();
													bdg++;
													ListClient.get(j).setBadge(bdg);
												}
											 }
											 if ( bdg == 0) {
												 System.out.println(" \n bdg == 0  Wolcam client \n");
												 Clnt =  new Client(Nom,prenom,email,telephone,badge);
												 Clnt.AjoutereClient(Clnt, ListClient);
												 System.out.println("\n achat avec succes");
											 }else if(bdg < 3) {
												 System.out.println(" \n nombre d'achat :" + bdg);
												 System.out.println("\n achat avec succes");
											 }else {
												 System.out.println(" \n nombre d'achat : " + bdg + " | tu es client fidèle");
												 System.out.println("\n achat avec succes");
											 }

											 break;
								    	default:	
									}
								}
								
				    		}else {
		  						System.out.println("Medicaments vide Ajouter des Medicaments");
		  					}
				    		break;
				    	default:
					}
					break;
			}
		}

	}

}
