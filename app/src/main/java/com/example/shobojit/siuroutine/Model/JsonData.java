package com.example.shobojit.siuroutine.Model;

import com.google.gson.Gson;

import java.util.List;

/**
 * Created by SHOBOJIT on 4/15/2017.
 */

public class JsonData {

    /**
     * dpt : [{"name":"cse11"},{"name":"cse12"},{"name":"cse21"},{"name":"cse22"},{"name":"cse31"},{"name":"cse32"},{"name":"cse41"},{"name":"cse42"},{"name":"ece11"},{"name":"ece12"},{"name":"ece21"},{"name":"ece22"},{"name":"ece31"},{"name":"ece32"},{"name":"ece41"},{"name":"ece42"},{"name":"eng11"},{"name":"eng12"},{"name":"eng21"},{"name":"eng22"},{"name":"eng31"},{"name":"eng32"},{"name":"eng41a"},{"name":"eng41b"}]
     * cse11 : {"SAT":[{"name":"HUM 105","room":"208","tname":"GH","start":"8.30","end":"9.20"},{"name":"CSE 102","room":"C-Lab","tname":"Rajarshi Roy Chowdhary","start":"10.10","end":"11.50"},{"name":"CSE 105","room":"215","tname":"Abdul Awal Ansary","start":"11.50","end":"12.40"},{"name":"MTH 105","room":"226","tname":"Rishi Kesh Gosh","start":"12.40","end":"1.30"}],"SUN":[{"name":"HUM 105","room":"210","tname":"GH","start":"8.30","end":"9.20"},{"name":"CSE 101","room":"215","tname":"Rajarshi Roy Chowdhary","start":"9.20","end":"10.10"},{"name":"PHY 101","room":"210","tname":"Subarna Sarker Rupa","start":"10.10","end":"11.00"},{"name":"CSE 106","room":"C-Lab","tname":"Abdul Awal Ansary","start":"11.50","end":"1.30"}],"MON":[{"name":"CSE 101","room":"226","tname":"Rajarshi Roy Chowdhary","start":"11.00","end":"11.50"},{"name":"CSE 105","room":"B-Lab","tname":"Abdul Awal Ansary","start":"11.50","end":"12.40"}],"TUE":[{"name":"HUM 105","room":"210","tname":"GH","start":"8.30","end":"9.20"},{"name":"HUM 113","room":"226","tname":"HRS","start":"9.20","end":"10.10"},{"name":"CSE 105","room":"210","tname":"Abdul Awal Ansary","start":"10.10","end":"11.00"},{"name":"CSE 101","room":"210","tname":"Rajarshi Roy Chowdhary","start":"11.00","end":"11.50"}],"WED":[{"name":"MTH 105","room":"210","tname":"Rishi Kesh Gosh","start":"11.00","end":"11.50"},{"name":"PHY 101","room":"P-Lab","tname":"Subarna Sarker Rupa","start":"11.50","end":"12.40"}],"THU":[{"name":"HUM 113","room":"226","tname":"HRS","start":"8.30","end":"9.20"},{"name":"MTH 105","room":"210","tname":"Rishi Kesh Gosh","start":"9.20","end":"10.10"},{"name":"PHY 101","room":"210","tname":"Subarna Sarker Rupa","start":"11.00","end":"11.50"}]}
     * cse12 : {"SAT":[{"name":"MTH 107","room":"210","tname":"Himadri Shekhar Chakraborty","start":"8.30","end":"9.20"},{"name":"MTH 107","room":"210","tname":"Himadri Shekhar Chakraborty","start":"9.20","end":"10.10"},{"name":"PHY 103","room":"224","tname":"Subarna Sarker Rupa","start":"10.10","end":"11.10"}],"SUN":[{"name":"HUM 103","room":"224","tname":"MH","start":"11.00","end":"11.50"},{"name":"ECE 102","room":"E-Lab","tname":"Syed Mohammed Asif","start":"11.50","end":"1.30"}],"MON":[{"name":"CSE 107","room":"210","tname":"Shusanta Acharjee","start":"9.20","end":"10.10"},{"name":"PHY 102","room":"P-Lab","tname":"Subarna Sarker Rupa","start":"10.10","end":"11.50"},{"name":"HUM 103","room":"215","tname":"MH","start":"11.50","end":"12.40"},{"name":"ECN 101","room":"208","tname":"HRS","start":"12.40","end":"1.30"}],"TUE":[{"name":"CSE 108","room":"C-Lab","tname":"Shusanta Acharjee","start":"9.20","end":"11.00"},{"name":"PHY 103","room":"P-Lab","tname":"Subarna Sarker Rupa","start":"11.00","end":"11.50"},{"name":"ECN 101","room":"208","tname":"HRS","start":"11.50","end":"12.40"},{"name":"ECE 101","room":"224","tname":"Syed Mohammed Asif","start":"12.40","end":"1.30"}],"WED":[{"name":"MTH 107","room":"224","tname":"Himadri Shekhar Chakraborty","start":"8.30","end":"9.20"},{"name":"ECN 101","room":"208","tname":"HRS","start":"9.20","end":"10.10"},{"name":"HUM 103","room":"224","tname":"HM","start":"10.10","end":"11.00"},{"name":"MTH 105","room":"210","tname":"Rajarshi Kesh Gosh","start":"11.00","end":"11.50"},{"name":"ECE","room":"210","tname":"Syed Mohammed Asif","start":"12.40","end":"1.30"}],"THU":[{"name":"MTH 105","room":"210","tname":"Rajarshi Kesh Gosh","start":"9.20","end":"10.10"},{"name":"PHY 103","room":"224","tname":"Subarna Sarker Rupa","start":"10.10","end":"11.00"},{"name":"CSE 107","room":"224","tname":"Shusanta Acharjee","start":"11.00","end":"11.50"}]}
     * cse21 : {"SAT":[{"name":"MTH 205","room":"210","tname":"Rishi Kesh Gosh","start":"10.10","end":"11.00"},{"name":"CSE 211","room":"208","tname":"Golam Murtoza Sifat","start":"11.00","end":"11.50"},{"name":"CSE 205","room":"226","tname":"MAG Asif","start":"11.50","end":"12.40"}],"SUN":[{"name":"CSE 205","room":"226","tname":"MAG Asif","start":"8.30","end":"9.20"},{"name":"CSE 201","room":"224","tname":"Farida Yesmin Riva","start":"10.10","end":"11.00"},{"name":"CSE 211","room":"S-Lab","tname":"Golam Murtoza Sifat","start":"11.50","end":"12.40"},{"name":"ECE 201","room":"210","tname":"Shahjahan Ahmed","start":"12.40","end":"1.30"}],"MON":[{"name":"CSE 201","room":"S-Lab","tname":"Farida Yesmin Riva","start":"9.20","end":"10.10"},{"name":"CSE 211","room":"224","tname":"Golam Murtoza Sifat","start":"10.10","end":"11.00"},{"name":"CSE 205","room":"208","tname":"MAG Asif","start":"11.00","end":"11.50"}],"TUE":[{"name":"MTH 205","room":"226","tname":"Rishi Kesh Gosh","start":"10.10","end":"11.00"},{"name":"CSE 201","room":"208","tname":"Farida Yesmin Riva","start":"11.00","end":"11.50"},{"name":"ECE 201","room":"210","tname":"Shahjahan Ahmed","start":"11.50","end":"12.40"},{"name":"ACN 203","room":"208","tname":"*","start":"12.40","end":"1.30"}],"WED":[{"name":"ACN 203","room":"210","tname":"*","start":"10.10","end":"11.00"},{"name":"ECE 201","room":"208","tname":"Shahjahan Ahmed","start":"11.00","end":"11.50"},{"name":"CSE 212","room":"S-Lab","tname":"Golam Murtoza Sifat","start":"12.40","end":"2.50"}],"THU":[{"name":"ACN 203","room":"226","tname":"*","start":"9.20","end":"10.10"},{"name":"MTH 205","room":"208","tname":"Rishi  Kesh Gosh","start":"10.10","end":"11.00"},{"name":"CSE 206","room":"S-Lab","tname":"MAG Asif","start":"11.50","end":"1.30"}]}
     * cse22 : {"SAT":[{"name":"MTH 207","room":"210","tname":"Anowarul Islam","start":"9.20","end":"10.10"}],"SUN":[{"name":"CSE 207","room":"S-Lab","tname":"MAG Asif","start":"11.10","end":"11.00"},{"name":"CSE 209","room":"208","tname":"Gius Uddin","start":"11.00","end":"11.50"},{"name":"IMG 201","room":"208","tname":"*","start":"11.50","end":"12.40"},{"name":"CSE 208","room":"S-Lab","tname":"MAG Asif","start":"12.40","end":"2.50"}],"MON":[{"name":"MTH 207","room":"215","tname":"Anowarul Islam","start":"8.30","end":"9.20"},{"name":"MTH 207","room":"215","tname":"Anowarul Islam","start":"9.20","end":"10.10"},{"name":"CSE 207","room":"215","tname":"MAG Asif","start":"10.10","end":"11.00"},{"name":"IMG 201","room":"210","tname":"* ","start":"11.00","end":"11.50"},{"name":"CSE 231","room":"210","tname":"Rajib Karmaker","start":"11.50","end":"12.40"}],"TUE":[{"name":"CSE 232","room":"E-Lab","tname":"Rajib Karmaker","start":"8.30","end":"10.10"},{"name":"CSE 231","room":"P-Lab","tname":"Rajib Karmaker","start":"11.00","end":"11.50"},{"name":"CSE 207","room":"B-Lab","tname":"MAG Asif","start":"11.50","end":"12.40"}],"WED":[{"name":"CSE 231","room":"208","tname":"Rajib Karmaker","start":"8.30","end":"9.20"},{"name":"CSE 209","room":"210","tname":"Gius Uddin","start":"9.20","end":"10.10"},{"name":"CSE 209","room":"215","tname":"Gius Uddin","start":"10.10","end":"11.00"},{"name":"CSE 200","room":"S-Lab","tname":"Golam Murtoza Sifat","start":"11.00","end":"12.40"}],"THU":[{"name":"No Class","room":"No Class","tname":"No Class","start":"No Class","end":"No Class"}]}
     * cse31 : {"SAT":[{"name":"MTH 301","room":"215","tname":"Ahmed Kabir Chowdhary","start":"8.30","end":"9.20"},{"name":"CSE 301","room":"S-Lab","tname":"M.A.G Asif","start":"10.10","end":"11.00"},{"name":"CSE 321","room":"226","tname":"Farida Yesmin Riva","start":"11.00","end":"11.50"},{"name":"ECE 477","room":"224","tname":"FBM","start":"11.50","end":"12.40"}],"SUN":[{"name":"MTH 301","room":"215","tname":"Ahmed Kabir Chowdhary","start":"8.30","end":"9.20"},{"name":"CSE 331","room":"208","tname":"Rajarshi Roy Chowdhary","start":"10.10","end":"11.00"},{"name":"CSE 301","room":"210","tname":"MAG Asif","start":"11.00","end":"11.50"}],"MON":[{"name":"MTH 301","room":"208","tname":"Ahmed Kabir Chowdhary","start":"8.30","end":"9.20"},{"name":"CSE 301","room":"226","tname":"MAG Asif","start":"9.20","end":"10.10"},{"name":"ECE 477","room":"208","tname":"FBM","start":"10.10","end":"11.00"},{"name":"CSE 332","room":"C-Lab","tname":"Farida Yesmin Riva","start":"11.00","end":"12.40"}],"TUE":[{"name":"CSE 331","room":"208","tname":"Rajarshi Roy Chowdhary","start":"9.20","end":"10.10"},{"name":"ECE 477","room":"226","tname":"FBM","start":"11.50","end":"12.40"}],"WED":[{"name":"No Class","room":"No Class","tname":"No Class","start":"No Class","end":"No Class"}],"THU":[{"name":"CSE 300","room":"S-Lab","tname":"MAG Asif","start":"8.30","end":"10.10"},{"name":"CSE 302","room":"C-Lab","tname":"MAG Asif","start":"10.10","end":"11.50"},{"name":"ECE 478","room":"E-Lab","tname":"FBM","start":"11.50","end":"1.30"},{"name":"CSE 321","room":"226","tname":"Farida Yesmin Riva","start":"2.00","end":"2.50"}]}
     * cse32 : {"SAT":[{"name":"CSE 335","room":"226","tname":"Rajib Karmaker","start":"8.30","end":"9.20"},{"name":"CSE 333","room":"226","tname":"Farida Yesmin Riva","start":"9.20","end":"10.10"},{"name":"CSE 305","room":"226","tname":"Khaled Hussain","start":"10.10","end":"11.0"},{"name":"CSE 334","room":"S-Lab","tname":"Farida Yesmin Riva","start":"2.00","end":"3.40"}],"SUN":[{"name":"CSE 305","room":"215","tname":"Khaled Hussain","start":"10.10","end":"11.00"},{"name":"CSE 315","room":"B-Lab","tname":"Farida Yesmin Riva","start":"11.50","end":"12.40"},{"name":"CSE 333","room":"226","tname":"Farida Yesmin Riva","start":"12.40","end":"1.30"}],"MON":[{"name":"CSE 336","room":"E-Lab","tname":"Rajib Karmaker","start":"9.20","end":"11.00"},{"name":"CSE 303","room":"215","tname":"Ashiqul Islam Rajib","start":"11.00","end":"11.50"},{"name":"CSE 331","room":"226","tname":"Rajarshi Roy Chowdhary","start":"11.50","end":"12.40"}],"TUE":[{"name":"CSE 315","room":"210","tname":"Farida Yesmin Riva","start":"9.20","end":"10.10"},{"name":"CSE 306","room":"C-Lab","tname":"Khaled Hussain","start":"10.10","end":"11.50"},{"name":"CSE 303","room":"226","tname":"Ashiqul Islam Rajib","start":"12.40","end":"1.30"}],"WED":[{"name":"CSE 335","room":"B-Lab","tname":"Rajib Karmaker","start":"10.10","end":"11.00"},{"name":"CSE 303","room":"C-Lab","tname":"Ashiqul Islam Rajib","start":"11.00","end":"11.50"}],"THU":[{"name":"CSE 305","room":"226","tname":"Khaled Hussain","start":"9.20","end":"10.10"},{"name":"CSE 333","room":"226","tname":"Farida Yesmin Riva","start":"10.10","end":"11.00"},{"name":"CSE 315","room":"226","tname":"Farida Yesmin Riva","start":"11.00","end":"11.50"},{"name":"CSE 304","room":"C-Lab","tname":"Ashiqul Islam Rajib","start":"11.50","end":"1.30"}]}
     * cse41 : {"SAT":[{"name":"CSE 421","room":"215","tname":"Rajarshi Roy Chowdhary","start":"9.20","end":"10.10"},{"name":"CSE 403","room":"215","tname":"Golam Murtoza Sifat","start":"10.10","end":"11.00"},{"name":"CSE 401","room":"215","tname":"Khaled Hussain","start":"11.00","end":"11.50"},{"name":"CSE 404","room":"C-Lab","tname":"Golam Murtoza Sifat","start":"12.40","end":"2.50"}],"SUN":[{"name":"CSE 432","room":"C-Lab","tname":"Shusanta Acharjee","start":"8.30","end":"10.10"},{"name":"CSE 453","room":"226","tname":"Abdul Awal Ansary","start":"10.10","end":"11.00"},{"name":"CSE 401","room":"226","tname":"Khaled Hussain","start":"11.00","end":"11.50"},{"name":"CSE 421","room":"215","tname":"Rajarshi Roy Chowdhary","start":"11.50","end":"12.40"},{"name":"CSE 403","room":"215","tname":"Golam Murtoza Sifat","start":"12.40","end":"1.30"}],"MON":[{"name":"CSE 422","room":"C-Lab","tname":"Rajarshi Roy Chowdhary","start":"8.30","end":"10.10"}],"TUE":[{"name":"CSE 431","room":"215","tname":"Shusanta Acharjee","start":"9.20","end":"10.10"},{"name":"CSE 421","room":"215","tname":"Rajarshi Roy Chowdhary","start":"10.10","end":"11.00"},{"name":"CSE 453","room":"215","tname":"Abdul Awal Ansary","start":"11.50","end":"12.40"},{"name":"CSE 431","room":"215","tname":"Shusanta Acharjee","start":"12.40","end":"1.30"},{"name":"CSE 403","room":"215","tname":"Golam Murtoza Sifat","start":"2.00","end":"2.50"}],"WED":[{"name":"CSE 454","room":"C-Lab","tname":"Abdul Awal Ansary","start":"9.20","end":"11.00"},{"name":"CSE 401","room":"215","tname":"Khaled Hussain","start":"11.00","end":"11.50"},{"name":"CSE 453","room":"215","tname":"Abdul Awal Ansary","start":"11.50","end":"12.40"},{"name":"CSE 431","room":"215","tname":"Shusanta Acharjee","start":"12.40","end":"1.30"}],"THU":[{"name":"No Class","room":"No Class","tname":"No Class","start":"No Class","end":"No Class"}]}
     * cse42 : {"SAT":[{"name":"CSE 435","room":"215","tname":"Abdul Awal Ansary","start":"10.10","end":"11.00"},{"name":"CSE 411","room":"S-Lab","tname":"Rajib Karmaker","start":"11.00","end":"11.50"},{"name":"CSE 405","room":"C-Lab","tname":"Khaled Hussain","start":"11.50","end":"12.40"},{"name":"CSE 464","room":"S-Lab","tname":"Ashiqul Islam Rajib","start":"2.50","end":"3.40"}],"SUN":[{"name":"No Class","room":"No Class","tname":"No Class","start":"No Class","end":"No Class"}],"MON":[{"name":"CSE 436","room":"S-Lab","tname":"Shusanta Acharjee","start":"10.10","end":"11.50"},{"name":"CSE 463","room":"208","tname":"Ashiqul Islam Rajib","start":"11.50","end":"12.40"}],"TUE":[{"name":"CSE 406","room":"C-Lab","tname":"Khaled Hussain","start":"8.30","end":"10.10"},{"name":"CSE 411","room":"208","tname":"Rajib Karmaker","start":"10.10","end":"11.00"},{"name":"CSE 435","room":"215","tname":"Abdul Awal Ansary","start":"10.10","end":"11.00"}],"WED":[{"name":"CSE 405","room":"226","tname":"Khaled Hussain","start":"10.10","end":"11.00"},{"name":"CSE 435","room":"226","tname":"Abdul Awal Ansary","start":"11.00","end":"11.50"},{"name":"CSE 463","room":"226","tname":"Ashiqul Islam Rajib","start":"11.50","end":"12.40"}],"THU":[{"name":"CSE 405","room":"215","tname":"Khaled Hussain","start":"10.10","end":"11.00"},{"name":"CSE 463","room":"215","tname":"Ashiqul Islam Rajib","start":"11.00","end":"11.50"},{"name":"CSE 411","room":"215","tname":"Rajib Karmaker","start":"11.50","end":"12.40"}]}
     * ece11 : {"SAT":[{"name":"CSE 101","room":"208","tname":"GH","start":"8.30","end":"9.20"},{"name":"CSE 113","room":"224","tname":"Ekramul Farook","start":"9.20","end":"10.10"},{"name":"CSE 105","room":"215","tname":"Abdul Awal Ansary","start":"11.50","end":"12.40"},{"name":"MTH 105","room":"226","tname":"Rajarshi Kesh Gosh","start":"12.40","end":"1.30"}],"SUN":[{"name":"HUM 101","room":"210","tname":"GH","start":"8.30","end":"9.20"},{"name":"CHE 101","room":"210","tname":"SI","start":"9.20","end":"10.10"},{"name":"PHY 101","room":"210","tname":"SSR","start":"10.10","end":"11.00"}],"MON":[{"name":"CHE 101","room":"224","tname":"SI","start":"9.20","end":"10.10"},{"name":"CSE 113","room":"210","tname":"Ekramul Farook","start":"10.10","end":"11.00"},{"name":"CSE 114","room":"S-Lab","tname":"Ekramul Farook","start":"11.50","end":"1.30"}],"TUE":[{"name":"HUM 101","room":"210","tname":"GH","start":"8.30","end":"9.20"},{"name":"HUM 113","room":"226","tname":"HRS","start":"9.20","end":"10.10"}],"WED":[{"name":"CSE 113","room":"208","tname":"Ekramul Farook","start":"10.10","end":"11.00"},{"name":"MTH 105","room":"210","tname":"Rishi Kesh Gosh","start":"11.00","end":"11.50"},{"name":"PHY 101","room":"P-Lab","tname":"SSR","start":"11.50","end":"12.40"}],"THU":[{"name":"MTH 105","room":"210","tname":"Rishi Kesh Gosh","start":"9.20","end":"10.10"},{"name":"PHY 101","room":"210","tname":"SSR","start":"11.00","end":"11.50"},{"name":"CHE 102","room":"P-Lab","tname":"SI","start":"11.50","end":"1.30"}]}
     * ece12 : {"SAT":[{"name":"MTH 107","room":"210","tname":"HSC","start":"8.30","end":"9.20"},{"name":"MTH 107","room":"210","tname":"HSC","start":"8.30","end":"9.20"},{"name":"PHY 103","room":"224","tname":"SSR","start":"10.10","end":"11.00"}],"SUN":[{"name":"HUM 111","room":"226","tname":"HRS","start":"9.20","end":"10.10"},{"name":"ECE 201","room":"B-Lab","tname":"SH","start":"10.10","end":"11.00"},{"name":"HUM 103","room":"224","tname":"MH","start":"11.00","end":"11.50"},{"name":"ECE 102","room":"E-Lab","tname":"SMDA","start":"11.50","end":"1.30"}],"MON":[{"name":"PHY 102","room":"P-Lab","tname":"SSR","start":"10.10","end":"11.00"},{"name":"HUM 103","room":"215","tname":"MH","start":"11.50","end":"12.40"},{"name":"ECN 101","room":"210","tname":"HRS","start":"12.40","end":"1.30"}],"TUE":[{"name":"HUM 111","room":"226","tname":"HRS","start":"9.20","end":"10.10"},{"name":"PHY 103","room":"P-Lab","tname":"SSR","start":"11.00","end":"11.50"},{"name":"ECN 101","room":"208","tname":"HRS","start":"11.50","end":"12.40"}],"WED":[{"name":"MTH 107","room":"224","tname":"HSC","start":"8.30","end":"9.20"},{"name":"ECN 101","room":"208","tname":"HRS","start":"9.20","end":"10.10"},{"name":"HUM 103","room":"224","tname":"MH","start":"10.10","end":"11.00"},{"name":"MTH 105","room":"210","tname":"RG","start":"11.00","end":"11.50"}],"THU":[{"name":"HUM 111","room":"226","tname":"HRS","start":"8.30","end":"9.20"},{"name":"MTH 105","room":"210","tname":"RG","start":"9.20","end":"10.10"},{"name":"PHY 103","room":"224","tname":"SSR","start":"10.10","end":"11.00"}]}
     * ece21 : {"SAT":[{"name":"MTH 301","room":"215","tname":"AKC","start":"8.30","end":"9.20"},{"name":"MTH 205","room":"210","tname":"RG","start":"10.10","end":"11.00"},{"name":"ACN 201","room":"224","tname":"*","start":"11.00","end":"11.50"}],"SUN":[{"name":"MTH 301","room":"215","tname":"AKC","start":"8.30","end":"9.20"},{"name":"ACN 201","room":"224","tname":"*","start":"9.20","end":"10.10"}],"MON":[{"name":"MTH 301","room":"208","tname":"AKC","start":"8.30","end":"9.20"}],"TUE":[{"name":"HUM 111","room":"226","tname":"HRS","start":"9.20","end":"10.10"},{"name":"MTH 205","room":"226","tname":"Rishi Kesh Gosh","start":"10.10","end":"11.00"}],"WED":[{"name":"ECE 201","room":"208","tname":"Shahjahan Ahmed","start":"11.00","end":"11.50"},{"name":"ECE 202","room":"E-Lab","tname":"Shahjahan Ahmed","start":"11.50","end":"1.30"}],"THU":[{"name":"HUM 111","room":"226","tname":"HRS","start":"8.30","end":"9.20"},{"name":"MTH 205","room":"208","tname":"RG","start":"10.10","end":"11.00"}]}
     * ece22 : {"SAT":[{"name":"No Class","room":"No Class","tname":"No Class","start":"No Class","end":"No Class"}],"SUN":[{"name":"No Class","room":"No Class","tname":"No Class","start":"No Class","end":"No Class"}],"MON":[{"name":"No Class","room":"No Class","tname":"No Class","start":"No Class","end":"No Class"}],"TUE":[{"name":"No Class","room":"No Class","tname":"No Class","start":"No Class","end":"No Class"}],"WED":[{"name":"No Class","room":"No Class","tname":"No Class","start":"No Class","end":"No Class"}],"THU":[{"name":"No Class","room":"No Class","tname":"No Class","start":"No Class","end":"No Class"}]}
     * ece31 : {"SAT":[{"name":"ECE 378","room":"E-Lab","tname":"SA","start":"10.10","end":"11.50"}],"SUN":[{"name":"ECE 357","room":"224","tname":"SH","start":"11.50","end":"12.40"}],"MON":[{"name":"ECE 377","room":"210","tname":"SA","start":"8.30","end":"9.20"},{"name":"ECE 357","room":"226","tname":"SH","start":"10.10","end":"11.00"},{"name":"IPE 393","room":"224","tname":"KDI","start":"11.00","end":"11.50"},{"name":"CSE 231","room":"210","tname":"RKK","start":"11.50","end":"12.40"}],"TUE":[{"name":"CSE 232","room":"E-Lab","tname":"RKK","start":"8.30","end":"10.10"},{"name":"ECE 377","room":"224","tname":"SA","start":"10.10","end":"11.00"},{"name":"CSE 231","room":"226","tname":"RKK","start":"11.00","end":"11.50"},{"name":"ECE 357","room":"B-Lab","tname":"SH","start":"11.50","end":"12.40"}],"WED":[{"name":"CSE 231","room":"208","tname":"RKK","start":"8.30","end":"9.20"},{"name":"IPE 393","room":"224","tname":"KDI","start":"9.20","end":"10.10"},{"name":"ECE 350","room":"M-Lab","tname":"KDI","start":"10.10","end":"11.50"}],"THU":[{"name":"IPE 393","room":"210","tname":"KDI","start":"10.10","end":"11.00"},{"name":"ECE 357","room":"S-Lab","tname":"SH","start":"11.00","end":"11.50"},{"name":"ECE 478","room":"E-Lab","tname":"FBM","start":"11.50","end":"1.30"}]}
     * ece32 : {"SAT":[{"name":"CSE 327","room":"215","tname":"RRC","start":"9.20","end":"10.10"},{"name":"ECE 477","room":"224","tname":"FBM","start":"11.50","end":"12.40"}],"SUN":[{"name":"CSE 327","room":"215","tname":"RRC","start":"11.50","end":"12.40"}],"MON":[{"name":"CSE 328","room":"C-Lab","tname":"RRC","start":"8.30","end":"10.10"},{"name":"ECE 477","room":"208","tname":"FBM","start":"10.10","end":"11.00"}],"TUE":[{"name":"CSE 232","room":"E-Lab","tname":"RKK","start":"8.30","end":"10.10"},{"name":"CSE 327","room":"215","tname":"RRC","start":"10.10","end":"11.00"},{"name":"ECE 477","room":"226","tname":"FBM","start":"11.00","end":"11.50"}],"WED":[{"name":"CSE 231","room":"208","tname":"RKK","start":"8.30","end":"9.20"}],"THU":[{"name":"ECE 478","room":"E-Lab","tname":"FBM","start":"11.50","end":"1.30"}]}
     * ece41 : {"SAT":[{"name":"ECE 465","room":"215","tname":"Ekramul Farook","start":"12.40","end":"1.30"}],"SUN":[{"name":"No Class","room":"No Class","tname":"No Class","start":"No Class","end":"No Class"}],"MON":[{"name":"ECE 471","room":"215","tname":"Mahmudul Alam Mia","start":"12.40","end":"1.30"}],"TUE":[{"name":"ECE 465","room":"B-Lab","tname":"Ekramul Farook","start":"10.10","end":"11.00"},{"name":"ECE 457","room":"S-Lab","tname":"Mahmudul Alam Mia","start":"11.50","end":"1.30"}],"WED":[{"name":"ECE 471","room":"B-Lab","tname":"MAM","start":"11.00","end":"11.50"},{"name":"ECE 465","room":"224","tname":"Ekramul Farook","start":"11.50","end":"12.40"}],"THU":[{"name":"ECE 471","room":"B-Lab","tname":"MAM","start":"10.10","end":"11.00"},{"name":"ECE 466","room":"M-Lab","tname":"Ekramul Farook","start":"11.50","end":"1.30"}]}
     * ece42 : {"SAT":[{"name":"ECE 465","room":"215","tname":"Ekramul Farook","start":"12.40","end":"1.30"}],"SUN":[{"name":"No Class","room":"No Class","tname":"No Class","start":"No Class","end":"No Class"}],"MON":[{"name":"ECE 471","room":"215","tname":"Mahmudul Alam Mia","start":"12.40","end":"1.30"}],"TUE":[{"name":"ECE 465","room":"B-Lab","tname":"Ekramul Farook","start":"10.10","end":"11.00"},{"name":"ECE 472","room":"S-Lab","tname":"Mahmudul Alam Mia","start":"11.50","end":"1.30"}],"WED":[{"name":"ECE 471","room":"B-Lab","tname":"MAM","start":"11.00","end":"11.50"},{"name":"ECE 465","room":"224","tname":"Ekramul Farook","start":"11.50","end":"12.40"}],"THU":[{"name":"ECE 471","room":"B-Lab","tname":"MAM","start":"10.10","end":"11.00"},{"name":"ECE 466","room":"M-Lab","tname":"Ekramul Farook","start":"11.50","end":"1.30"}]}
     */

    private Cse11Bean cse11;
    private Cse12Bean cse12;
    private Cse21Bean cse21;
    private Cse22Bean cse22;
    private Cse31Bean cse31;
    private Cse32Bean cse32;
    private Cse41Bean cse41;
    private Cse42Bean cse42;
    private Ece11Bean ece11;
    private Ece12Bean ece12;
    private Ece21Bean ece21;
    private Ece22Bean ece22;
    private Ece31Bean ece31;
    private Ece32Bean ece32;
    private Ece41Bean ece41;
    private Ece42Bean ece42;
    private List<DptBean> dpt;

    public static JsonData objectFromData(String str) {

        return new Gson().fromJson(str, JsonData.class);
    }

    public Cse11Bean getCse11() {
        return cse11;
    }

    public void setCse11(Cse11Bean cse11) {
        this.cse11 = cse11;
    }

    public Cse12Bean getCse12() {
        return cse12;
    }

    public void setCse12(Cse12Bean cse12) {
        this.cse12 = cse12;
    }

    public Cse21Bean getCse21() {
        return cse21;
    }

    public void setCse21(Cse21Bean cse21) {
        this.cse21 = cse21;
    }

    public Cse22Bean getCse22() {
        return cse22;
    }

    public void setCse22(Cse22Bean cse22) {
        this.cse22 = cse22;
    }

    public Cse31Bean getCse31() {
        return cse31;
    }

    public void setCse31(Cse31Bean cse31) {
        this.cse31 = cse31;
    }

    public Cse32Bean getCse32() {
        return cse32;
    }

    public void setCse32(Cse32Bean cse32) {
        this.cse32 = cse32;
    }

    public Cse41Bean getCse41() {
        return cse41;
    }

    public void setCse41(Cse41Bean cse41) {
        this.cse41 = cse41;
    }

    public Cse42Bean getCse42() {
        return cse42;
    }

    public void setCse42(Cse42Bean cse42) {
        this.cse42 = cse42;
    }

    public Ece11Bean getEce11() {
        return ece11;
    }

    public void setEce11(Ece11Bean ece11) {
        this.ece11 = ece11;
    }

    public Ece12Bean getEce12() {
        return ece12;
    }

    public void setEce12(Ece12Bean ece12) {
        this.ece12 = ece12;
    }

    public Ece21Bean getEce21() {
        return ece21;
    }

    public void setEce21(Ece21Bean ece21) {
        this.ece21 = ece21;
    }

    public Ece22Bean getEce22() {
        return ece22;
    }

    public void setEce22(Ece22Bean ece22) {
        this.ece22 = ece22;
    }

    public Ece31Bean getEce31() {
        return ece31;
    }

    public void setEce31(Ece31Bean ece31) {
        this.ece31 = ece31;
    }

    public Ece32Bean getEce32() {
        return ece32;
    }

    public void setEce32(Ece32Bean ece32) {
        this.ece32 = ece32;
    }

    public Ece41Bean getEce41() {
        return ece41;
    }

    public void setEce41(Ece41Bean ece41) {
        this.ece41 = ece41;
    }

    public Ece42Bean getEce42() {
        return ece42;
    }

    public void setEce42(Ece42Bean ece42) {
        this.ece42 = ece42;
    }

    public List<DptBean> getDpt() {
        return dpt;
    }

    public void setDpt(List<DptBean> dpt) {
        this.dpt = dpt;
    }

    public static class Cse11Bean {
        private List<SATBean> SAT;
        private List<SUNBean> SUN;
        private List<MONBean> MON;
        private List<TUEBean> TUE;
        private List<WEDBean> WED;
        private List<THUBean> THU;

        public static Cse11Bean objectFromData(String str) {

            return new Gson().fromJson(str, Cse11Bean.class);
        }

        public List<SATBean> getSAT() {
            return SAT;
        }

        public void setSAT(List<SATBean> SAT) {
            this.SAT = SAT;
        }

        public List<SUNBean> getSUN() {
            return SUN;
        }

        public void setSUN(List<SUNBean> SUN) {
            this.SUN = SUN;
        }

        public List<MONBean> getMON() {
            return MON;
        }

        public void setMON(List<MONBean> MON) {
            this.MON = MON;
        }

        public List<TUEBean> getTUE() {
            return TUE;
        }

        public void setTUE(List<TUEBean> TUE) {
            this.TUE = TUE;
        }

        public List<WEDBean> getWED() {
            return WED;
        }

        public void setWED(List<WEDBean> WED) {
            this.WED = WED;
        }

        public List<THUBean> getTHU() {
            return THU;
        }

        public void setTHU(List<THUBean> THU) {
            this.THU = THU;
        }

        public static class SATBean {
            /**
             * name : HUM 105
             * room : 208
             * tname : GH
             * start : 8.30
             * end : 9.20
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static SATBean objectFromData(String str) {

                return new Gson().fromJson(str, SATBean.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class SUNBean {
            /**
             * name : HUM 105
             * room : 210
             * tname : GH
             * start : 8.30
             * end : 9.20
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static SUNBean objectFromData(String str) {

                return new Gson().fromJson(str, SUNBean.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class MONBean {
            /**
             * name : CSE 101
             * room : 226
             * tname : Rajarshi Roy Chowdhary
             * start : 11.00
             * end : 11.50
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static MONBean objectFromData(String str) {

                return new Gson().fromJson(str, MONBean.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class TUEBean {
            /**
             * name : HUM 105
             * room : 210
             * tname : GH
             * start : 8.30
             * end : 9.20
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static TUEBean objectFromData(String str) {

                return new Gson().fromJson(str, TUEBean.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class WEDBean {
            /**
             * name : MTH 105
             * room : 210
             * tname : Rishi Kesh Gosh
             * start : 11.00
             * end : 11.50
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static WEDBean objectFromData(String str) {

                return new Gson().fromJson(str, WEDBean.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class THUBean {
            /**
             * name : HUM 113
             * room : 226
             * tname : HRS
             * start : 8.30
             * end : 9.20
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static THUBean objectFromData(String str) {

                return new Gson().fromJson(str, THUBean.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }
    }

    public static class Cse12Bean {
        private List<SATBeanX> SAT;
        private List<SUNBeanX> SUN;
        private List<MONBeanX> MON;
        private List<TUEBeanX> TUE;
        private List<WEDBeanX> WED;
        private List<THUBeanX> THU;

        public static Cse12Bean objectFromData(String str) {

            return new Gson().fromJson(str, Cse12Bean.class);
        }

        public List<SATBeanX> getSAT() {
            return SAT;
        }

        public void setSAT(List<SATBeanX> SAT) {
            this.SAT = SAT;
        }

        public List<SUNBeanX> getSUN() {
            return SUN;
        }

        public void setSUN(List<SUNBeanX> SUN) {
            this.SUN = SUN;
        }

        public List<MONBeanX> getMON() {
            return MON;
        }

        public void setMON(List<MONBeanX> MON) {
            this.MON = MON;
        }

        public List<TUEBeanX> getTUE() {
            return TUE;
        }

        public void setTUE(List<TUEBeanX> TUE) {
            this.TUE = TUE;
        }

        public List<WEDBeanX> getWED() {
            return WED;
        }

        public void setWED(List<WEDBeanX> WED) {
            this.WED = WED;
        }

        public List<THUBeanX> getTHU() {
            return THU;
        }

        public void setTHU(List<THUBeanX> THU) {
            this.THU = THU;
        }

        public static class SATBeanX {
            /**
             * name : MTH 107
             * room : 210
             * tname : Himadri Shekhar Chakraborty
             * start : 8.30
             * end : 9.20
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static SATBeanX objectFromData(String str) {

                return new Gson().fromJson(str, SATBeanX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class SUNBeanX {
            /**
             * name : HUM 103
             * room : 224
             * tname : MH
             * start : 11.00
             * end : 11.50
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static SUNBeanX objectFromData(String str) {

                return new Gson().fromJson(str, SUNBeanX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class MONBeanX {
            /**
             * name : CSE 107
             * room : 210
             * tname : Shusanta Acharjee
             * start : 9.20
             * end : 10.10
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static MONBeanX objectFromData(String str) {

                return new Gson().fromJson(str, MONBeanX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class TUEBeanX {
            /**
             * name : CSE 108
             * room : C-Lab
             * tname : Shusanta Acharjee
             * start : 9.20
             * end : 11.00
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static TUEBeanX objectFromData(String str) {

                return new Gson().fromJson(str, TUEBeanX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class WEDBeanX {
            /**
             * name : MTH 107
             * room : 224
             * tname : Himadri Shekhar Chakraborty
             * start : 8.30
             * end : 9.20
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static WEDBeanX objectFromData(String str) {

                return new Gson().fromJson(str, WEDBeanX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class THUBeanX {
            /**
             * name : MTH 105
             * room : 210
             * tname : Rajarshi Kesh Gosh
             * start : 9.20
             * end : 10.10
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static THUBeanX objectFromData(String str) {

                return new Gson().fromJson(str, THUBeanX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }
    }

    public static class Cse21Bean {
        private List<SATBeanXX> SAT;
        private List<SUNBeanXX> SUN;
        private List<MONBeanXX> MON;
        private List<TUEBeanXX> TUE;
        private List<WEDBeanXX> WED;
        private List<THUBeanXX> THU;

        public static Cse21Bean objectFromData(String str) {

            return new Gson().fromJson(str, Cse21Bean.class);
        }

        public List<SATBeanXX> getSAT() {
            return SAT;
        }

        public void setSAT(List<SATBeanXX> SAT) {
            this.SAT = SAT;
        }

        public List<SUNBeanXX> getSUN() {
            return SUN;
        }

        public void setSUN(List<SUNBeanXX> SUN) {
            this.SUN = SUN;
        }

        public List<MONBeanXX> getMON() {
            return MON;
        }

        public void setMON(List<MONBeanXX> MON) {
            this.MON = MON;
        }

        public List<TUEBeanXX> getTUE() {
            return TUE;
        }

        public void setTUE(List<TUEBeanXX> TUE) {
            this.TUE = TUE;
        }

        public List<WEDBeanXX> getWED() {
            return WED;
        }

        public void setWED(List<WEDBeanXX> WED) {
            this.WED = WED;
        }

        public List<THUBeanXX> getTHU() {
            return THU;
        }

        public void setTHU(List<THUBeanXX> THU) {
            this.THU = THU;
        }

        public static class SATBeanXX {
            /**
             * name : MTH 205
             * room : 210
             * tname : Rishi Kesh Gosh
             * start : 10.10
             * end : 11.00
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static SATBeanXX objectFromData(String str) {

                return new Gson().fromJson(str, SATBeanXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class SUNBeanXX {
            /**
             * name : CSE 205
             * room : 226
             * tname : MAG Asif
             * start : 8.30
             * end : 9.20
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static SUNBeanXX objectFromData(String str) {

                return new Gson().fromJson(str, SUNBeanXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class MONBeanXX {
            /**
             * name : CSE 201
             * room : S-Lab
             * tname : Farida Yesmin Riva
             * start : 9.20
             * end : 10.10
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static MONBeanXX objectFromData(String str) {

                return new Gson().fromJson(str, MONBeanXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class TUEBeanXX {
            /**
             * name : MTH 205
             * room : 226
             * tname : Rishi Kesh Gosh
             * start : 10.10
             * end : 11.00
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static TUEBeanXX objectFromData(String str) {

                return new Gson().fromJson(str, TUEBeanXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class WEDBeanXX {
            /**
             * name : ACN 203
             * room : 210
             * tname : *
             * start : 10.10
             * end : 11.00
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static WEDBeanXX objectFromData(String str) {

                return new Gson().fromJson(str, WEDBeanXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class THUBeanXX {
            /**
             * name : ACN 203
             * room : 226
             * tname : *
             * start : 9.20
             * end : 10.10
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static THUBeanXX objectFromData(String str) {

                return new Gson().fromJson(str, THUBeanXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }
    }

    public static class Cse22Bean {
        private List<SATBeanXXX> SAT;
        private List<SUNBeanXXX> SUN;
        private List<MONBeanXXX> MON;
        private List<TUEBeanXXX> TUE;
        private List<WEDBeanXXX> WED;
        private List<THUBeanXXX> THU;

        public static Cse22Bean objectFromData(String str) {

            return new Gson().fromJson(str, Cse22Bean.class);
        }

        public List<SATBeanXXX> getSAT() {
            return SAT;
        }

        public void setSAT(List<SATBeanXXX> SAT) {
            this.SAT = SAT;
        }

        public List<SUNBeanXXX> getSUN() {
            return SUN;
        }

        public void setSUN(List<SUNBeanXXX> SUN) {
            this.SUN = SUN;
        }

        public List<MONBeanXXX> getMON() {
            return MON;
        }

        public void setMON(List<MONBeanXXX> MON) {
            this.MON = MON;
        }

        public List<TUEBeanXXX> getTUE() {
            return TUE;
        }

        public void setTUE(List<TUEBeanXXX> TUE) {
            this.TUE = TUE;
        }

        public List<WEDBeanXXX> getWED() {
            return WED;
        }

        public void setWED(List<WEDBeanXXX> WED) {
            this.WED = WED;
        }

        public List<THUBeanXXX> getTHU() {
            return THU;
        }

        public void setTHU(List<THUBeanXXX> THU) {
            this.THU = THU;
        }

        public static class SATBeanXXX {
            /**
             * name : MTH 207
             * room : 210
             * tname : Anowarul Islam
             * start : 9.20
             * end : 10.10
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static SATBeanXXX objectFromData(String str) {

                return new Gson().fromJson(str, SATBeanXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class SUNBeanXXX {
            /**
             * name : CSE 207
             * room : S-Lab
             * tname : MAG Asif
             * start : 11.10
             * end : 11.00
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static SUNBeanXXX objectFromData(String str) {

                return new Gson().fromJson(str, SUNBeanXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class MONBeanXXX {
            /**
             * name : MTH 207
             * room : 215
             * tname : Anowarul Islam
             * start : 8.30
             * end : 9.20
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static MONBeanXXX objectFromData(String str) {

                return new Gson().fromJson(str, MONBeanXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class TUEBeanXXX {
            /**
             * name : CSE 232
             * room : E-Lab
             * tname : Rajib Karmaker
             * start : 8.30
             * end : 10.10
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static TUEBeanXXX objectFromData(String str) {

                return new Gson().fromJson(str, TUEBeanXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class WEDBeanXXX {
            /**
             * name : CSE 231
             * room : 208
             * tname : Rajib Karmaker
             * start : 8.30
             * end : 9.20
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static WEDBeanXXX objectFromData(String str) {

                return new Gson().fromJson(str, WEDBeanXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class THUBeanXXX {
            /**
             * name : No Class
             * room : No Class
             * tname : No Class
             * start : No Class
             * end : No Class
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static THUBeanXXX objectFromData(String str) {

                return new Gson().fromJson(str, THUBeanXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }
    }

    public static class Cse31Bean {
        private List<SATBeanXXXX> SAT;
        private List<SUNBeanXXXX> SUN;
        private List<MONBeanXXXX> MON;
        private List<TUEBeanXXXX> TUE;
        private List<WEDBeanXXXX> WED;
        private List<THUBeanXXXX> THU;

        public static Cse31Bean objectFromData(String str) {

            return new Gson().fromJson(str, Cse31Bean.class);
        }

        public List<SATBeanXXXX> getSAT() {
            return SAT;
        }

        public void setSAT(List<SATBeanXXXX> SAT) {
            this.SAT = SAT;
        }

        public List<SUNBeanXXXX> getSUN() {
            return SUN;
        }

        public void setSUN(List<SUNBeanXXXX> SUN) {
            this.SUN = SUN;
        }

        public List<MONBeanXXXX> getMON() {
            return MON;
        }

        public void setMON(List<MONBeanXXXX> MON) {
            this.MON = MON;
        }

        public List<TUEBeanXXXX> getTUE() {
            return TUE;
        }

        public void setTUE(List<TUEBeanXXXX> TUE) {
            this.TUE = TUE;
        }

        public List<WEDBeanXXXX> getWED() {
            return WED;
        }

        public void setWED(List<WEDBeanXXXX> WED) {
            this.WED = WED;
        }

        public List<THUBeanXXXX> getTHU() {
            return THU;
        }

        public void setTHU(List<THUBeanXXXX> THU) {
            this.THU = THU;
        }

        public static class SATBeanXXXX {
            /**
             * name : MTH 301
             * room : 215
             * tname : Ahmed Kabir Chowdhary
             * start : 8.30
             * end : 9.20
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static SATBeanXXXX objectFromData(String str) {

                return new Gson().fromJson(str, SATBeanXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class SUNBeanXXXX {
            /**
             * name : MTH 301
             * room : 215
             * tname : Ahmed Kabir Chowdhary
             * start : 8.30
             * end : 9.20
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static SUNBeanXXXX objectFromData(String str) {

                return new Gson().fromJson(str, SUNBeanXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class MONBeanXXXX {
            /**
             * name : MTH 301
             * room : 208
             * tname : Ahmed Kabir Chowdhary
             * start : 8.30
             * end : 9.20
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static MONBeanXXXX objectFromData(String str) {

                return new Gson().fromJson(str, MONBeanXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class TUEBeanXXXX {
            /**
             * name : CSE 331
             * room : 208
             * tname : Rajarshi Roy Chowdhary
             * start : 9.20
             * end : 10.10
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static TUEBeanXXXX objectFromData(String str) {

                return new Gson().fromJson(str, TUEBeanXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class WEDBeanXXXX {
            /**
             * name : No Class
             * room : No Class
             * tname : No Class
             * start : No Class
             * end : No Class
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static WEDBeanXXXX objectFromData(String str) {

                return new Gson().fromJson(str, WEDBeanXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class THUBeanXXXX {
            /**
             * name : CSE 300
             * room : S-Lab
             * tname : MAG Asif
             * start : 8.30
             * end : 10.10
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static THUBeanXXXX objectFromData(String str) {

                return new Gson().fromJson(str, THUBeanXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }
    }

    public static class Cse32Bean {
        private List<SATBeanXXXXX> SAT;
        private List<SUNBeanXXXXX> SUN;
        private List<MONBeanXXXXX> MON;
        private List<TUEBeanXXXXX> TUE;
        private List<WEDBeanXXXXX> WED;
        private List<THUBeanXXXXX> THU;

        public static Cse32Bean objectFromData(String str) {

            return new Gson().fromJson(str, Cse32Bean.class);
        }

        public List<SATBeanXXXXX> getSAT() {
            return SAT;
        }

        public void setSAT(List<SATBeanXXXXX> SAT) {
            this.SAT = SAT;
        }

        public List<SUNBeanXXXXX> getSUN() {
            return SUN;
        }

        public void setSUN(List<SUNBeanXXXXX> SUN) {
            this.SUN = SUN;
        }

        public List<MONBeanXXXXX> getMON() {
            return MON;
        }

        public void setMON(List<MONBeanXXXXX> MON) {
            this.MON = MON;
        }

        public List<TUEBeanXXXXX> getTUE() {
            return TUE;
        }

        public void setTUE(List<TUEBeanXXXXX> TUE) {
            this.TUE = TUE;
        }

        public List<WEDBeanXXXXX> getWED() {
            return WED;
        }

        public void setWED(List<WEDBeanXXXXX> WED) {
            this.WED = WED;
        }

        public List<THUBeanXXXXX> getTHU() {
            return THU;
        }

        public void setTHU(List<THUBeanXXXXX> THU) {
            this.THU = THU;
        }

        public static class SATBeanXXXXX {
            /**
             * name : CSE 335
             * room : 226
             * tname : Rajib Karmaker
             * start : 8.30
             * end : 9.20
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static SATBeanXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, SATBeanXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class SUNBeanXXXXX {
            /**
             * name : CSE 305
             * room : 215
             * tname : Khaled Hussain
             * start : 10.10
             * end : 11.00
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static SUNBeanXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, SUNBeanXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class MONBeanXXXXX {
            /**
             * name : CSE 336
             * room : E-Lab
             * tname : Rajib Karmaker
             * start : 9.20
             * end : 11.00
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static MONBeanXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, MONBeanXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class TUEBeanXXXXX {
            /**
             * name : CSE 315
             * room : 210
             * tname : Farida Yesmin Riva
             * start : 9.20
             * end : 10.10
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static TUEBeanXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, TUEBeanXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class WEDBeanXXXXX {
            /**
             * name : CSE 335
             * room : B-Lab
             * tname : Rajib Karmaker
             * start : 10.10
             * end : 11.00
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static WEDBeanXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, WEDBeanXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class THUBeanXXXXX {
            /**
             * name : CSE 305
             * room : 226
             * tname : Khaled Hussain
             * start : 9.20
             * end : 10.10
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static THUBeanXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, THUBeanXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }
    }

    public static class Cse41Bean {
        private List<SATBeanXXXXXX> SAT;
        private List<SUNBeanXXXXXX> SUN;
        private List<MONBeanXXXXXX> MON;
        private List<TUEBeanXXXXXX> TUE;
        private List<WEDBeanXXXXXX> WED;
        private List<THUBeanXXXXXX> THU;

        public static Cse41Bean objectFromData(String str) {

            return new Gson().fromJson(str, Cse41Bean.class);
        }

        public List<SATBeanXXXXXX> getSAT() {
            return SAT;
        }

        public void setSAT(List<SATBeanXXXXXX> SAT) {
            this.SAT = SAT;
        }

        public List<SUNBeanXXXXXX> getSUN() {
            return SUN;
        }

        public void setSUN(List<SUNBeanXXXXXX> SUN) {
            this.SUN = SUN;
        }

        public List<MONBeanXXXXXX> getMON() {
            return MON;
        }

        public void setMON(List<MONBeanXXXXXX> MON) {
            this.MON = MON;
        }

        public List<TUEBeanXXXXXX> getTUE() {
            return TUE;
        }

        public void setTUE(List<TUEBeanXXXXXX> TUE) {
            this.TUE = TUE;
        }

        public List<WEDBeanXXXXXX> getWED() {
            return WED;
        }

        public void setWED(List<WEDBeanXXXXXX> WED) {
            this.WED = WED;
        }

        public List<THUBeanXXXXXX> getTHU() {
            return THU;
        }

        public void setTHU(List<THUBeanXXXXXX> THU) {
            this.THU = THU;
        }

        public static class SATBeanXXXXXX {
            /**
             * name : CSE 421
             * room : 215
             * tname : Rajarshi Roy Chowdhary
             * start : 9.20
             * end : 10.10
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static SATBeanXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, SATBeanXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class SUNBeanXXXXXX {
            /**
             * name : CSE 432
             * room : C-Lab
             * tname : Shusanta Acharjee
             * start : 8.30
             * end : 10.10
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static SUNBeanXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, SUNBeanXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class MONBeanXXXXXX {
            /**
             * name : CSE 422
             * room : C-Lab
             * tname : Rajarshi Roy Chowdhary
             * start : 8.30
             * end : 10.10
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static MONBeanXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, MONBeanXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class TUEBeanXXXXXX {
            /**
             * name : CSE 431
             * room : 215
             * tname : Shusanta Acharjee
             * start : 9.20
             * end : 10.10
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static TUEBeanXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, TUEBeanXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class WEDBeanXXXXXX {
            /**
             * name : CSE 454
             * room : C-Lab
             * tname : Abdul Awal Ansary
             * start : 9.20
             * end : 11.00
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static WEDBeanXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, WEDBeanXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class THUBeanXXXXXX {
            /**
             * name : No Class
             * room : No Class
             * tname : No Class
             * start : No Class
             * end : No Class
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static THUBeanXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, THUBeanXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }
    }

    public static class Cse42Bean {
        private List<SATBeanXXXXXXX> SAT;
        private List<SUNBeanXXXXXXX> SUN;
        private List<MONBeanXXXXXXX> MON;
        private List<TUEBeanXXXXXXX> TUE;
        private List<WEDBeanXXXXXXX> WED;
        private List<THUBeanXXXXXXX> THU;

        public static Cse42Bean objectFromData(String str) {

            return new Gson().fromJson(str, Cse42Bean.class);
        }

        public List<SATBeanXXXXXXX> getSAT() {
            return SAT;
        }

        public void setSAT(List<SATBeanXXXXXXX> SAT) {
            this.SAT = SAT;
        }

        public List<SUNBeanXXXXXXX> getSUN() {
            return SUN;
        }

        public void setSUN(List<SUNBeanXXXXXXX> SUN) {
            this.SUN = SUN;
        }

        public List<MONBeanXXXXXXX> getMON() {
            return MON;
        }

        public void setMON(List<MONBeanXXXXXXX> MON) {
            this.MON = MON;
        }

        public List<TUEBeanXXXXXXX> getTUE() {
            return TUE;
        }

        public void setTUE(List<TUEBeanXXXXXXX> TUE) {
            this.TUE = TUE;
        }

        public List<WEDBeanXXXXXXX> getWED() {
            return WED;
        }

        public void setWED(List<WEDBeanXXXXXXX> WED) {
            this.WED = WED;
        }

        public List<THUBeanXXXXXXX> getTHU() {
            return THU;
        }

        public void setTHU(List<THUBeanXXXXXXX> THU) {
            this.THU = THU;
        }

        public static class SATBeanXXXXXXX {
            /**
             * name : CSE 435
             * room : 215
             * tname : Abdul Awal Ansary
             * start : 10.10
             * end : 11.00
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static SATBeanXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, SATBeanXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class SUNBeanXXXXXXX {
            /**
             * name : No Class
             * room : No Class
             * tname : No Class
             * start : No Class
             * end : No Class
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static SUNBeanXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, SUNBeanXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class MONBeanXXXXXXX {
            /**
             * name : CSE 436
             * room : S-Lab
             * tname : Shusanta Acharjee
             * start : 10.10
             * end : 11.50
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static MONBeanXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, MONBeanXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class TUEBeanXXXXXXX {
            /**
             * name : CSE 406
             * room : C-Lab
             * tname : Khaled Hussain
             * start : 8.30
             * end : 10.10
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static TUEBeanXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, TUEBeanXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class WEDBeanXXXXXXX {
            /**
             * name : CSE 405
             * room : 226
             * tname : Khaled Hussain
             * start : 10.10
             * end : 11.00
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static WEDBeanXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, WEDBeanXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class THUBeanXXXXXXX {
            /**
             * name : CSE 405
             * room : 215
             * tname : Khaled Hussain
             * start : 10.10
             * end : 11.00
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static THUBeanXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, THUBeanXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }
    }

    public static class Ece11Bean {
        private List<SATBeanXXXXXXXX> SAT;
        private List<SUNBeanXXXXXXXX> SUN;
        private List<MONBeanXXXXXXXX> MON;
        private List<TUEBeanXXXXXXXX> TUE;
        private List<WEDBeanXXXXXXXX> WED;
        private List<THUBeanXXXXXXXX> THU;

        public static Ece11Bean objectFromData(String str) {

            return new Gson().fromJson(str, Ece11Bean.class);
        }

        public List<SATBeanXXXXXXXX> getSAT() {
            return SAT;
        }

        public void setSAT(List<SATBeanXXXXXXXX> SAT) {
            this.SAT = SAT;
        }

        public List<SUNBeanXXXXXXXX> getSUN() {
            return SUN;
        }

        public void setSUN(List<SUNBeanXXXXXXXX> SUN) {
            this.SUN = SUN;
        }

        public List<MONBeanXXXXXXXX> getMON() {
            return MON;
        }

        public void setMON(List<MONBeanXXXXXXXX> MON) {
            this.MON = MON;
        }

        public List<TUEBeanXXXXXXXX> getTUE() {
            return TUE;
        }

        public void setTUE(List<TUEBeanXXXXXXXX> TUE) {
            this.TUE = TUE;
        }

        public List<WEDBeanXXXXXXXX> getWED() {
            return WED;
        }

        public void setWED(List<WEDBeanXXXXXXXX> WED) {
            this.WED = WED;
        }

        public List<THUBeanXXXXXXXX> getTHU() {
            return THU;
        }

        public void setTHU(List<THUBeanXXXXXXXX> THU) {
            this.THU = THU;
        }

        public static class SATBeanXXXXXXXX {
            /**
             * name : CSE 101
             * room : 208
             * tname : GH
             * start : 8.30
             * end : 9.20
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static SATBeanXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, SATBeanXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class SUNBeanXXXXXXXX {
            /**
             * name : HUM 101
             * room : 210
             * tname : GH
             * start : 8.30
             * end : 9.20
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static SUNBeanXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, SUNBeanXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class MONBeanXXXXXXXX {
            /**
             * name : CHE 101
             * room : 224
             * tname : SI
             * start : 9.20
             * end : 10.10
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static MONBeanXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, MONBeanXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class TUEBeanXXXXXXXX {
            /**
             * name : HUM 101
             * room : 210
             * tname : GH
             * start : 8.30
             * end : 9.20
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static TUEBeanXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, TUEBeanXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class WEDBeanXXXXXXXX {
            /**
             * name : CSE 113
             * room : 208
             * tname : Ekramul Farook
             * start : 10.10
             * end : 11.00
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static WEDBeanXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, WEDBeanXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class THUBeanXXXXXXXX {
            /**
             * name : MTH 105
             * room : 210
             * tname : Rishi Kesh Gosh
             * start : 9.20
             * end : 10.10
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static THUBeanXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, THUBeanXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }
    }

    public static class Ece12Bean {
        private List<SATBeanXXXXXXXXX> SAT;
        private List<SUNBeanXXXXXXXXX> SUN;
        private List<MONBeanXXXXXXXXX> MON;
        private List<TUEBeanXXXXXXXXX> TUE;
        private List<WEDBeanXXXXXXXXX> WED;
        private List<THUBeanXXXXXXXXX> THU;

        public static Ece12Bean objectFromData(String str) {

            return new Gson().fromJson(str, Ece12Bean.class);
        }

        public List<SATBeanXXXXXXXXX> getSAT() {
            return SAT;
        }

        public void setSAT(List<SATBeanXXXXXXXXX> SAT) {
            this.SAT = SAT;
        }

        public List<SUNBeanXXXXXXXXX> getSUN() {
            return SUN;
        }

        public void setSUN(List<SUNBeanXXXXXXXXX> SUN) {
            this.SUN = SUN;
        }

        public List<MONBeanXXXXXXXXX> getMON() {
            return MON;
        }

        public void setMON(List<MONBeanXXXXXXXXX> MON) {
            this.MON = MON;
        }

        public List<TUEBeanXXXXXXXXX> getTUE() {
            return TUE;
        }

        public void setTUE(List<TUEBeanXXXXXXXXX> TUE) {
            this.TUE = TUE;
        }

        public List<WEDBeanXXXXXXXXX> getWED() {
            return WED;
        }

        public void setWED(List<WEDBeanXXXXXXXXX> WED) {
            this.WED = WED;
        }

        public List<THUBeanXXXXXXXXX> getTHU() {
            return THU;
        }

        public void setTHU(List<THUBeanXXXXXXXXX> THU) {
            this.THU = THU;
        }

        public static class SATBeanXXXXXXXXX {
            /**
             * name : MTH 107
             * room : 210
             * tname : HSC
             * start : 8.30
             * end : 9.20
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static SATBeanXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, SATBeanXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class SUNBeanXXXXXXXXX {
            /**
             * name : HUM 111
             * room : 226
             * tname : HRS
             * start : 9.20
             * end : 10.10
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static SUNBeanXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, SUNBeanXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class MONBeanXXXXXXXXX {
            /**
             * name : PHY 102
             * room : P-Lab
             * tname : SSR
             * start : 10.10
             * end : 11.00
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static MONBeanXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, MONBeanXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class TUEBeanXXXXXXXXX {
            /**
             * name : HUM 111
             * room : 226
             * tname : HRS
             * start : 9.20
             * end : 10.10
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static TUEBeanXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, TUEBeanXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class WEDBeanXXXXXXXXX {
            /**
             * name : MTH 107
             * room : 224
             * tname : HSC
             * start : 8.30
             * end : 9.20
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static WEDBeanXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, WEDBeanXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class THUBeanXXXXXXXXX {
            /**
             * name : HUM 111
             * room : 226
             * tname : HRS
             * start : 8.30
             * end : 9.20
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static THUBeanXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, THUBeanXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }
    }

    public static class Ece21Bean {
        private List<SATBeanXXXXXXXXXX> SAT;
        private List<SUNBeanXXXXXXXXXX> SUN;
        private List<MONBeanXXXXXXXXXX> MON;
        private List<TUEBeanXXXXXXXXXX> TUE;
        private List<WEDBeanXXXXXXXXXX> WED;
        private List<THUBeanXXXXXXXXXX> THU;

        public static Ece21Bean objectFromData(String str) {

            return new Gson().fromJson(str, Ece21Bean.class);
        }

        public List<SATBeanXXXXXXXXXX> getSAT() {
            return SAT;
        }

        public void setSAT(List<SATBeanXXXXXXXXXX> SAT) {
            this.SAT = SAT;
        }

        public List<SUNBeanXXXXXXXXXX> getSUN() {
            return SUN;
        }

        public void setSUN(List<SUNBeanXXXXXXXXXX> SUN) {
            this.SUN = SUN;
        }

        public List<MONBeanXXXXXXXXXX> getMON() {
            return MON;
        }

        public void setMON(List<MONBeanXXXXXXXXXX> MON) {
            this.MON = MON;
        }

        public List<TUEBeanXXXXXXXXXX> getTUE() {
            return TUE;
        }

        public void setTUE(List<TUEBeanXXXXXXXXXX> TUE) {
            this.TUE = TUE;
        }

        public List<WEDBeanXXXXXXXXXX> getWED() {
            return WED;
        }

        public void setWED(List<WEDBeanXXXXXXXXXX> WED) {
            this.WED = WED;
        }

        public List<THUBeanXXXXXXXXXX> getTHU() {
            return THU;
        }

        public void setTHU(List<THUBeanXXXXXXXXXX> THU) {
            this.THU = THU;
        }

        public static class SATBeanXXXXXXXXXX {
            /**
             * name : MTH 301
             * room : 215
             * tname : AKC
             * start : 8.30
             * end : 9.20
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static SATBeanXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, SATBeanXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class SUNBeanXXXXXXXXXX {
            /**
             * name : MTH 301
             * room : 215
             * tname : AKC
             * start : 8.30
             * end : 9.20
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static SUNBeanXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, SUNBeanXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class MONBeanXXXXXXXXXX {
            /**
             * name : MTH 301
             * room : 208
             * tname : AKC
             * start : 8.30
             * end : 9.20
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static MONBeanXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, MONBeanXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class TUEBeanXXXXXXXXXX {
            /**
             * name : HUM 111
             * room : 226
             * tname : HRS
             * start : 9.20
             * end : 10.10
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static TUEBeanXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, TUEBeanXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class WEDBeanXXXXXXXXXX {
            /**
             * name : ECE 201
             * room : 208
             * tname : Shahjahan Ahmed
             * start : 11.00
             * end : 11.50
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static WEDBeanXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, WEDBeanXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class THUBeanXXXXXXXXXX {
            /**
             * name : HUM 111
             * room : 226
             * tname : HRS
             * start : 8.30
             * end : 9.20
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static THUBeanXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, THUBeanXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }
    }

    public static class Ece22Bean {
        private List<SATBeanXXXXXXXXXXX> SAT;
        private List<SUNBeanXXXXXXXXXXX> SUN;
        private List<MONBeanXXXXXXXXXXX> MON;
        private List<TUEBeanXXXXXXXXXXX> TUE;
        private List<WEDBeanXXXXXXXXXXX> WED;
        private List<THUBeanXXXXXXXXXXX> THU;

        public static Ece22Bean objectFromData(String str) {

            return new Gson().fromJson(str, Ece22Bean.class);
        }

        public List<SATBeanXXXXXXXXXXX> getSAT() {
            return SAT;
        }

        public void setSAT(List<SATBeanXXXXXXXXXXX> SAT) {
            this.SAT = SAT;
        }

        public List<SUNBeanXXXXXXXXXXX> getSUN() {
            return SUN;
        }

        public void setSUN(List<SUNBeanXXXXXXXXXXX> SUN) {
            this.SUN = SUN;
        }

        public List<MONBeanXXXXXXXXXXX> getMON() {
            return MON;
        }

        public void setMON(List<MONBeanXXXXXXXXXXX> MON) {
            this.MON = MON;
        }

        public List<TUEBeanXXXXXXXXXXX> getTUE() {
            return TUE;
        }

        public void setTUE(List<TUEBeanXXXXXXXXXXX> TUE) {
            this.TUE = TUE;
        }

        public List<WEDBeanXXXXXXXXXXX> getWED() {
            return WED;
        }

        public void setWED(List<WEDBeanXXXXXXXXXXX> WED) {
            this.WED = WED;
        }

        public List<THUBeanXXXXXXXXXXX> getTHU() {
            return THU;
        }

        public void setTHU(List<THUBeanXXXXXXXXXXX> THU) {
            this.THU = THU;
        }

        public static class SATBeanXXXXXXXXXXX {
            /**
             * name : No Class
             * room : No Class
             * tname : No Class
             * start : No Class
             * end : No Class
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static SATBeanXXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, SATBeanXXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class SUNBeanXXXXXXXXXXX {
            /**
             * name : No Class
             * room : No Class
             * tname : No Class
             * start : No Class
             * end : No Class
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static SUNBeanXXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, SUNBeanXXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class MONBeanXXXXXXXXXXX {
            /**
             * name : No Class
             * room : No Class
             * tname : No Class
             * start : No Class
             * end : No Class
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static MONBeanXXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, MONBeanXXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class TUEBeanXXXXXXXXXXX {
            /**
             * name : No Class
             * room : No Class
             * tname : No Class
             * start : No Class
             * end : No Class
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static TUEBeanXXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, TUEBeanXXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class WEDBeanXXXXXXXXXXX {
            /**
             * name : No Class
             * room : No Class
             * tname : No Class
             * start : No Class
             * end : No Class
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static WEDBeanXXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, WEDBeanXXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class THUBeanXXXXXXXXXXX {
            /**
             * name : No Class
             * room : No Class
             * tname : No Class
             * start : No Class
             * end : No Class
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static THUBeanXXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, THUBeanXXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }
    }

    public static class Ece31Bean {
        private List<SATBeanXXXXXXXXXXXX> SAT;
        private List<SUNBeanXXXXXXXXXXXX> SUN;
        private List<MONBeanXXXXXXXXXXXX> MON;
        private List<TUEBeanXXXXXXXXXXXX> TUE;
        private List<WEDBeanXXXXXXXXXXXX> WED;
        private List<THUBeanXXXXXXXXXXXX> THU;

        public static Ece31Bean objectFromData(String str) {

            return new Gson().fromJson(str, Ece31Bean.class);
        }

        public List<SATBeanXXXXXXXXXXXX> getSAT() {
            return SAT;
        }

        public void setSAT(List<SATBeanXXXXXXXXXXXX> SAT) {
            this.SAT = SAT;
        }

        public List<SUNBeanXXXXXXXXXXXX> getSUN() {
            return SUN;
        }

        public void setSUN(List<SUNBeanXXXXXXXXXXXX> SUN) {
            this.SUN = SUN;
        }

        public List<MONBeanXXXXXXXXXXXX> getMON() {
            return MON;
        }

        public void setMON(List<MONBeanXXXXXXXXXXXX> MON) {
            this.MON = MON;
        }

        public List<TUEBeanXXXXXXXXXXXX> getTUE() {
            return TUE;
        }

        public void setTUE(List<TUEBeanXXXXXXXXXXXX> TUE) {
            this.TUE = TUE;
        }

        public List<WEDBeanXXXXXXXXXXXX> getWED() {
            return WED;
        }

        public void setWED(List<WEDBeanXXXXXXXXXXXX> WED) {
            this.WED = WED;
        }

        public List<THUBeanXXXXXXXXXXXX> getTHU() {
            return THU;
        }

        public void setTHU(List<THUBeanXXXXXXXXXXXX> THU) {
            this.THU = THU;
        }

        public static class SATBeanXXXXXXXXXXXX {
            /**
             * name : ECE 378
             * room : E-Lab
             * tname : SA
             * start : 10.10
             * end : 11.50
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static SATBeanXXXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, SATBeanXXXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class SUNBeanXXXXXXXXXXXX {
            /**
             * name : ECE 357
             * room : 224
             * tname : SH
             * start : 11.50
             * end : 12.40
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static SUNBeanXXXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, SUNBeanXXXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class MONBeanXXXXXXXXXXXX {
            /**
             * name : ECE 377
             * room : 210
             * tname : SA
             * start : 8.30
             * end : 9.20
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static MONBeanXXXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, MONBeanXXXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class TUEBeanXXXXXXXXXXXX {
            /**
             * name : CSE 232
             * room : E-Lab
             * tname : RKK
             * start : 8.30
             * end : 10.10
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static TUEBeanXXXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, TUEBeanXXXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class WEDBeanXXXXXXXXXXXX {
            /**
             * name : CSE 231
             * room : 208
             * tname : RKK
             * start : 8.30
             * end : 9.20
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static WEDBeanXXXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, WEDBeanXXXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class THUBeanXXXXXXXXXXXX {
            /**
             * name : IPE 393
             * room : 210
             * tname : KDI
             * start : 10.10
             * end : 11.00
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static THUBeanXXXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, THUBeanXXXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }
    }

    public static class Ece32Bean {
        private List<SATBeanXXXXXXXXXXXXX> SAT;
        private List<SUNBeanXXXXXXXXXXXXX> SUN;
        private List<MONBeanXXXXXXXXXXXXX> MON;
        private List<TUEBeanXXXXXXXXXXXXX> TUE;
        private List<WEDBeanXXXXXXXXXXXXX> WED;
        private List<THUBeanXXXXXXXXXXXXX> THU;

        public static Ece32Bean objectFromData(String str) {

            return new Gson().fromJson(str, Ece32Bean.class);
        }

        public List<SATBeanXXXXXXXXXXXXX> getSAT() {
            return SAT;
        }

        public void setSAT(List<SATBeanXXXXXXXXXXXXX> SAT) {
            this.SAT = SAT;
        }

        public List<SUNBeanXXXXXXXXXXXXX> getSUN() {
            return SUN;
        }

        public void setSUN(List<SUNBeanXXXXXXXXXXXXX> SUN) {
            this.SUN = SUN;
        }

        public List<MONBeanXXXXXXXXXXXXX> getMON() {
            return MON;
        }

        public void setMON(List<MONBeanXXXXXXXXXXXXX> MON) {
            this.MON = MON;
        }

        public List<TUEBeanXXXXXXXXXXXXX> getTUE() {
            return TUE;
        }

        public void setTUE(List<TUEBeanXXXXXXXXXXXXX> TUE) {
            this.TUE = TUE;
        }

        public List<WEDBeanXXXXXXXXXXXXX> getWED() {
            return WED;
        }

        public void setWED(List<WEDBeanXXXXXXXXXXXXX> WED) {
            this.WED = WED;
        }

        public List<THUBeanXXXXXXXXXXXXX> getTHU() {
            return THU;
        }

        public void setTHU(List<THUBeanXXXXXXXXXXXXX> THU) {
            this.THU = THU;
        }

        public static class SATBeanXXXXXXXXXXXXX {
            /**
             * name : CSE 327
             * room : 215
             * tname : RRC
             * start : 9.20
             * end : 10.10
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static SATBeanXXXXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, SATBeanXXXXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class SUNBeanXXXXXXXXXXXXX {
            /**
             * name : CSE 327
             * room : 215
             * tname : RRC
             * start : 11.50
             * end : 12.40
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static SUNBeanXXXXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, SUNBeanXXXXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class MONBeanXXXXXXXXXXXXX {
            /**
             * name : CSE 328
             * room : C-Lab
             * tname : RRC
             * start : 8.30
             * end : 10.10
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static MONBeanXXXXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, MONBeanXXXXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class TUEBeanXXXXXXXXXXXXX {
            /**
             * name : CSE 232
             * room : E-Lab
             * tname : RKK
             * start : 8.30
             * end : 10.10
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static TUEBeanXXXXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, TUEBeanXXXXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class WEDBeanXXXXXXXXXXXXX {
            /**
             * name : CSE 231
             * room : 208
             * tname : RKK
             * start : 8.30
             * end : 9.20
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static WEDBeanXXXXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, WEDBeanXXXXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class THUBeanXXXXXXXXXXXXX {
            /**
             * name : ECE 478
             * room : E-Lab
             * tname : FBM
             * start : 11.50
             * end : 1.30
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static THUBeanXXXXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, THUBeanXXXXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }
    }

    public static class Ece41Bean {
        private List<SATBeanXXXXXXXXXXXXXX> SAT;
        private List<SUNBeanXXXXXXXXXXXXXX> SUN;
        private List<MONBeanXXXXXXXXXXXXXX> MON;
        private List<TUEBeanXXXXXXXXXXXXXX> TUE;
        private List<WEDBeanXXXXXXXXXXXXXX> WED;
        private List<THUBeanXXXXXXXXXXXXXX> THU;

        public static Ece41Bean objectFromData(String str) {

            return new Gson().fromJson(str, Ece41Bean.class);
        }

        public List<SATBeanXXXXXXXXXXXXXX> getSAT() {
            return SAT;
        }

        public void setSAT(List<SATBeanXXXXXXXXXXXXXX> SAT) {
            this.SAT = SAT;
        }

        public List<SUNBeanXXXXXXXXXXXXXX> getSUN() {
            return SUN;
        }

        public void setSUN(List<SUNBeanXXXXXXXXXXXXXX> SUN) {
            this.SUN = SUN;
        }

        public List<MONBeanXXXXXXXXXXXXXX> getMON() {
            return MON;
        }

        public void setMON(List<MONBeanXXXXXXXXXXXXXX> MON) {
            this.MON = MON;
        }

        public List<TUEBeanXXXXXXXXXXXXXX> getTUE() {
            return TUE;
        }

        public void setTUE(List<TUEBeanXXXXXXXXXXXXXX> TUE) {
            this.TUE = TUE;
        }

        public List<WEDBeanXXXXXXXXXXXXXX> getWED() {
            return WED;
        }

        public void setWED(List<WEDBeanXXXXXXXXXXXXXX> WED) {
            this.WED = WED;
        }

        public List<THUBeanXXXXXXXXXXXXXX> getTHU() {
            return THU;
        }

        public void setTHU(List<THUBeanXXXXXXXXXXXXXX> THU) {
            this.THU = THU;
        }

        public static class SATBeanXXXXXXXXXXXXXX {
            /**
             * name : ECE 465
             * room : 215
             * tname : Ekramul Farook
             * start : 12.40
             * end : 1.30
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static SATBeanXXXXXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, SATBeanXXXXXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class SUNBeanXXXXXXXXXXXXXX {
            /**
             * name : No Class
             * room : No Class
             * tname : No Class
             * start : No Class
             * end : No Class
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static SUNBeanXXXXXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, SUNBeanXXXXXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class MONBeanXXXXXXXXXXXXXX {
            /**
             * name : ECE 471
             * room : 215
             * tname : Mahmudul Alam Mia
             * start : 12.40
             * end : 1.30
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static MONBeanXXXXXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, MONBeanXXXXXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class TUEBeanXXXXXXXXXXXXXX {
            /**
             * name : ECE 465
             * room : B-Lab
             * tname : Ekramul Farook
             * start : 10.10
             * end : 11.00
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static TUEBeanXXXXXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, TUEBeanXXXXXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class WEDBeanXXXXXXXXXXXXXX {
            /**
             * name : ECE 471
             * room : B-Lab
             * tname : MAM
             * start : 11.00
             * end : 11.50
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static WEDBeanXXXXXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, WEDBeanXXXXXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class THUBeanXXXXXXXXXXXXXX {
            /**
             * name : ECE 471
             * room : B-Lab
             * tname : MAM
             * start : 10.10
             * end : 11.00
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static THUBeanXXXXXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, THUBeanXXXXXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }
    }

    public static class Ece42Bean {
        private List<SATBeanXXXXXXXXXXXXXXX> SAT;
        private List<SUNBeanXXXXXXXXXXXXXXX> SUN;
        private List<MONBeanXXXXXXXXXXXXXXX> MON;
        private List<TUEBeanXXXXXXXXXXXXXXX> TUE;
        private List<WEDBeanXXXXXXXXXXXXXXX> WED;
        private List<THUBeanXXXXXXXXXXXXXXX> THU;

        public static Ece42Bean objectFromData(String str) {

            return new Gson().fromJson(str, Ece42Bean.class);
        }

        public List<SATBeanXXXXXXXXXXXXXXX> getSAT() {
            return SAT;
        }

        public void setSAT(List<SATBeanXXXXXXXXXXXXXXX> SAT) {
            this.SAT = SAT;
        }

        public List<SUNBeanXXXXXXXXXXXXXXX> getSUN() {
            return SUN;
        }

        public void setSUN(List<SUNBeanXXXXXXXXXXXXXXX> SUN) {
            this.SUN = SUN;
        }

        public List<MONBeanXXXXXXXXXXXXXXX> getMON() {
            return MON;
        }

        public void setMON(List<MONBeanXXXXXXXXXXXXXXX> MON) {
            this.MON = MON;
        }

        public List<TUEBeanXXXXXXXXXXXXXXX> getTUE() {
            return TUE;
        }

        public void setTUE(List<TUEBeanXXXXXXXXXXXXXXX> TUE) {
            this.TUE = TUE;
        }

        public List<WEDBeanXXXXXXXXXXXXXXX> getWED() {
            return WED;
        }

        public void setWED(List<WEDBeanXXXXXXXXXXXXXXX> WED) {
            this.WED = WED;
        }

        public List<THUBeanXXXXXXXXXXXXXXX> getTHU() {
            return THU;
        }

        public void setTHU(List<THUBeanXXXXXXXXXXXXXXX> THU) {
            this.THU = THU;
        }

        public static class SATBeanXXXXXXXXXXXXXXX {
            /**
             * name : ECE 465
             * room : 215
             * tname : Ekramul Farook
             * start : 12.40
             * end : 1.30
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static SATBeanXXXXXXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, SATBeanXXXXXXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class SUNBeanXXXXXXXXXXXXXXX {
            /**
             * name : No Class
             * room : No Class
             * tname : No Class
             * start : No Class
             * end : No Class
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static SUNBeanXXXXXXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, SUNBeanXXXXXXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class MONBeanXXXXXXXXXXXXXXX {
            /**
             * name : ECE 471
             * room : 215
             * tname : Mahmudul Alam Mia
             * start : 12.40
             * end : 1.30
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static MONBeanXXXXXXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, MONBeanXXXXXXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class TUEBeanXXXXXXXXXXXXXXX {
            /**
             * name : ECE 465
             * room : B-Lab
             * tname : Ekramul Farook
             * start : 10.10
             * end : 11.00
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static TUEBeanXXXXXXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, TUEBeanXXXXXXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class WEDBeanXXXXXXXXXXXXXXX {
            /**
             * name : ECE 471
             * room : B-Lab
             * tname : MAM
             * start : 11.00
             * end : 11.50
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static WEDBeanXXXXXXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, WEDBeanXXXXXXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }

        public static class THUBeanXXXXXXXXXXXXXXX {
            /**
             * name : ECE 471
             * room : B-Lab
             * tname : MAM
             * start : 10.10
             * end : 11.00
             */

            private String name;
            private String room;
            private String tname;
            private String start;
            private String end;

            public static THUBeanXXXXXXXXXXXXXXX objectFromData(String str) {

                return new Gson().fromJson(str, THUBeanXXXXXXXXXXXXXXX.class);
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getRoom() {
                return room;
            }

            public void setRoom(String room) {
                this.room = room;
            }

            public String getTname() {
                return tname;
            }

            public void setTname(String tname) {
                this.tname = tname;
            }

            public String getStart() {
                return start;
            }

            public void setStart(String start) {
                this.start = start;
            }

            public String getEnd() {
                return end;
            }

            public void setEnd(String end) {
                this.end = end;
            }
        }
    }

    public static class DptBean {
        /**
         * name : cse11
         */

        private String name;

        public static DptBean objectFromData(String str) {

            return new Gson().fromJson(str, DptBean.class);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
