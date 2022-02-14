import {Injectable} from '@angular/core';
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";
import {Device} from "./tester-match.model";


@Injectable({
  providedIn: 'root'
})
export class TesterMatchService {

  private _lookUp = 'http://localhost:8080/api/v1/look-up';

  private _getTesterMatch = 'http://localhost:8080/api/v1/tester-match';
  constructor(private httpClient: HttpClient) { }

  public getLookUpValues() : Observable<any> {
     return this.httpClient.get(this._lookUp);
  }

  public getTesterMatchingData(request: { countries: string[] | undefined ; devices: Device[] | undefined }) : Observable<any> {
    console.log(request)
    return this.httpClient.post(this._getTesterMatch, request);
  }
}
