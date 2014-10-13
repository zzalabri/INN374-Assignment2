using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace Assignment2
{
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the interface name "In8911371SupplierService" in both code and config file together.
    [ServiceContract]
    public interface In8911371SupplierService
    {
        [OperationContract]
        bool IsExistComponentNo(string componentNo);

        [OperationContract]
        string GetComponentName(String componentNo);

        [OperationContract]
        int GetCost(String componentNo);

        [OperationContract]
        int GetAmount(String componentNo);

        [OperationContract]
        bool CheckAmount(string componentNo, int exceptOrderAmount);

        [OperationContract]
        bool OrderAmount(string componentNo, int orderAmount);
    }
}
