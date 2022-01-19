import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class BibliothequesService {
  
  url="http://localhost:8080/bibliotheques"
  constructor(private http:HttpClient) { }
  getBibliotheque(){
    return this.http.get(this.url)
  }

  getNbrAdherant(paramA:any,paramB:any){
    return this.http.get("http://localhost:8080/bibliotheques/search/bynbrAdherant?minAdh="+paramA+"&maxAdh="+paramB)
  }
  
  
}

  

