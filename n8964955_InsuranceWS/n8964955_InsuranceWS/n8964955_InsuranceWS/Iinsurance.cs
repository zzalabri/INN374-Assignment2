using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.Text;

namespace Insurance {
    // NOTE: You can use the "Rename" command on the "Refactor" menu to change the interface name "Iinsurance" in both code and config file together.
    [ServiceContract]
    public interface Iinsurance {
        [OperationContract]
        bool IsInsured(string plateNo);
        [OperationContract]
        int GetDiscount(string plateNo);
    }
}
