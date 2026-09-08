import java.time.Instant;
import java.util.Date;

public class NotificationRequest {
    private String userId;
    private String channel;
    private String templateId;
    private String message;
    private int priority;
    private String metadata;
    private Instant scheduledAt;

    private NotificationRequest(){}

    public String getUserId() {
        return userId;
    }

    public String getChannel() {
        return channel;
    }

    public String getTemplateId() {
        return templateId;
    }

    public String getMessage() {
        return message;
    }

    public int getPriority() {
        return priority;
    }

    public String getMetadata() {
        return metadata;
    }

    public Instant getScheduledAt() {
        return scheduledAt;
    }

    @Override
    public String toString() {
        return "NotificationRequest{" +
                "userId='" + userId + '\'' +
                ", channel='" + channel + '\'' +
                ", templateId='" + templateId + '\'' +
                ", message='" + message + '\'' +
                ", priority=" + priority +
                ", metadata='" + metadata + '\'' +
                ", scheduledAt=" + scheduledAt +
                '}';
    }
    public static class Builder {
        private String userId;
        private String channel;
        private String templateId;
        private String message;
        private int priority;
        private String metadata;
        private Instant scheduledAt;
        public Builder() {}

        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }
        public Builder channel(String channel) {
            this.channel = channel;
            return this;
        }

        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public Builder message(String message) {
            this.message = message;
            return this;
        }
        public Builder priority(int priority) {
            this.priority = priority;
            return this;
        }
        public Builder metadata(String metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder scheduledAt(Instant scheduledAt) {
            this.scheduledAt = scheduledAt;
            return this;
        }
        public NotificationRequest build() {
            if(this.userId==null || this.message==null){
                throw new IllegalArgumentException("userId or message is null");
            }

            NotificationRequest request=new NotificationRequest();
            request.userId=this.userId;
            request.channel=this.channel;
            request.templateId=this.templateId;
            request.message=this.message;
            request.priority=this.priority;
            request.scheduledAt=this.scheduledAt;
            request.metadata=this.metadata;
            return request;
        }
    }
}
