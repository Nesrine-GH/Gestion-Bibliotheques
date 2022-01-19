import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthentificationService {
  public Users = [
    { prenom: "faty", motdepasse: "toto" },
    { prenom: "nesrine", motdepasse: "123" },
    { prenom: "emy", motdepasse: "titi" }
  ]

  constructor() { }
}
