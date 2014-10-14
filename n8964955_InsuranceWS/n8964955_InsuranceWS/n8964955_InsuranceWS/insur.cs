using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Runtime.Serialization;
using System.Data.SqlClient;

namespace Insurance {
    public class Insur {
        [DataMember]
        public int discount;        

        public Insur()
        {
            
        }

        public Insur(string plateNo)
        {

        }
    }
}