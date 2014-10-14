using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Runtime.Serialization;

namespace n8911371WarehouseService
{
    [DataContract]
    public class Warehouse
    {
        [DataMember]
        public String componentNo;
        [DataMember]
        public String componentName;
        [DataMember]
        public int cost;
        [DataMember]
        public int amount;

        public Warehouse() { }

        public Warehouse(String componentNo, String componentName, int cost, int amount)
        {
            this.componentNo = componentNo;
            this.componentName = componentName;
            this.cost = cost;
            this.amount = amount;
        }
    }
}