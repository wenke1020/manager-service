package io.choerodon.manager.api.dto.swagger;

import java.util.List;

/**
 * @author superlee
 */
public class PathDTO implements Comparable<PathDTO> {

    private String url;
    private String method;
    private List<String> consumes;
    private List<String> produces;
    private String operationId;
    private List<ParameterDTO> parameters;
    private List<ResponseDTO> responses;
    private String summary;
    private String description;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public List<String> getConsumes() {
        return consumes;
    }

    public void setConsumes(List<String> consumes) {
        this.consumes = consumes;
    }

    public List<String> getProduces() {
        return produces;
    }

    public void setProduces(List<String> produces) {
        this.produces = produces;
    }

    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public List<ParameterDTO> getParameters() {
        return parameters;
    }

    public void setParameters(List<ParameterDTO> parameters) {
        this.parameters = parameters;
    }

    public List<ResponseDTO> getResponses() {
        return responses;
    }

    public void setResponses(List<ResponseDTO> responses) {
        this.responses = responses;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PathDTO pathDTO = (PathDTO) o;

        if (url != null ? !url.equals(pathDTO.url) : pathDTO.url != null) return false;
        if (method != null ? !method.equals(pathDTO.method) : pathDTO.method != null) return false;
        if (operationId != null ? !operationId.equals(pathDTO.operationId) : pathDTO.operationId != null) return false;
        if (parameters != null ? !parameters.equals(pathDTO.parameters) : pathDTO.parameters != null) return false;
        if (summary != null ? !summary.equals(pathDTO.summary) : pathDTO.summary != null) return false;
        return description != null ? description.equals(pathDTO.description) : pathDTO.description == null;
    }

    @Override
    public int hashCode() {
        int result = url != null ? url.hashCode() : 0;
        result = 31 * result + (method != null ? method.hashCode() : 0);
        result = 31 * result + (operationId != null ? operationId.hashCode() : 0);
        result = 31 * result + (parameters != null ? parameters.hashCode() : 0);
        result = 31 * result + (summary != null ? summary.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PathDTO{" +
                "url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", consumes=" + consumes +
                ", produces=" + produces +
                ", operationId='" + operationId + '\'' +
                ", parameters=" + parameters +
                ", responses=" + responses +
                ", summary='" + summary + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public int compareTo(PathDTO o) {
        return o.url.compareTo(this.url);
    }
}