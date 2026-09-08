public class ReportRequest {
    private final String reportType;
    private final String userId;
    private final String format;
    private final String filters;
    private final String sort;
    private final String page;
    private final String pageSize;
    private final String includeMetaData;

    private ReportRequest(String reportType, String userId, String format, String filters, String sort, String page, String pageSize, String includeMetaData) {
        this.reportType = reportType;
        this.userId = userId;
        this.format = format;
        this.filters = filters;
        this.sort = sort;
        this.page = page;
        this.pageSize = pageSize;
        this.includeMetaData = includeMetaData;
    }

    public String getReportType() {
        return reportType;
    }

    public String getUserId() {
        return userId;
    }

    public String getFormat() {
        return format;
    }

    public String getFilters() {
        return filters;
    }

    public String getSort() {
        return sort;
    }

    public String getPage() {
        return page;
    }

    public String getPageSize() {
        return pageSize;
    }

    public String getIncludeMetaData() {
        return includeMetaData;
    }

    public static class Builder{
        private String reportType;
        private String userId;
        private String format;
        private String filters;
        private String sort;
        private String page;
        private String pageSize;
        private String includeMetaData;
        public Builder(){
            format="pdf";
            includeMetaData="false";
            pageSize="20";
            page="0";
            sort="ASC";
        }
        public Builder reportType(String reportType){
            this.reportType = reportType;
            return this;
        }
        public Builder userId(String userId){
            this.userId = userId;
            return this;
        }
        public Builder filters(String filters){
            this.filters = filters;
            return this;
        }
        public Builder sort(String sort){
            this.sort = sort;
            return this;
        }
        public Builder format(String format){
            this.format = format;
            return this;
        }
        public Builder page(String page){
            this.page = page;
            return this;
        }
        public Builder pageSize(String pageSize){
            this.pageSize = pageSize;
            return this;
        }
        public Builder includeMetaData(String includeMetaData){
            this.includeMetaData = includeMetaData;
            return this;
        }
        public ReportRequest build(){
            if(this.reportType == null || this.userId == null){
                throw new IllegalArgumentException("Report Type or User ID is null");
            }
            ReportRequest request=new ReportRequest(reportType, userId, format, filters, sort, page, pageSize, includeMetaData);
            return request;

        }

    }

    @Override
    public String toString() {
        return "ReportRequest{" +
                "reportType='" + reportType + '\'' +
                ", userId='" + userId + '\'' +
                ", format='" + format + '\'' +
                ", filters='" + filters + '\'' +
                ", sort='" + sort + '\'' +
                ", page='" + page + '\'' +
                ", pageSize='" + pageSize + '\'' +
                ", includeMetaData='" + includeMetaData + '\'' +
                '}';
    }
}
