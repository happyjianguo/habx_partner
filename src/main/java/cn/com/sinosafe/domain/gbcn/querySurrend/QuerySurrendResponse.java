package cn.com.sinosafe.domain.gbcn.querySurrend;

import cn.com.sinosafe.domain.gbcn.ResponseBody;
import cn.com.sinosafe.domain.gbcn.ResponseHead;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;

/**
 * @version 1.0
 * @Description 工保响应退保状态回执
 * @auther 林良
 * @Date 2019-09-01
 */
@XmlRootElement(name = "querySurrendResponse")
@XmlType(name = "querySurrendResponse",propOrder = {"responseHead","responseBody"})
public class QuerySurrendResponse implements Serializable {

    @Valid
    private ResponseHead responseHead;

    @Valid
    private ResponseBody responseBody;

    public ResponseHead getResponseHead() {
        return responseHead;
    }

    public void setResponseHead(ResponseHead responseHead) {
        this.responseHead = responseHead;
    }

    public ResponseBody getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(ResponseBody responseBody) {
        this.responseBody = responseBody;
    }
}
