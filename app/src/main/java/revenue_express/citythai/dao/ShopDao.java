package revenue_express.citythai.dao;

import java.util.List;

/**
 * Created by chaleamsuk on 12/26/2016.
 */
public class ShopDao {
    Boolean success;
    List<ShopDataDao> data;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<ShopDataDao> getData() {
        return data;
    }

    public void setData(List<ShopDataDao> data) {
        this.data = data;
    }
}
