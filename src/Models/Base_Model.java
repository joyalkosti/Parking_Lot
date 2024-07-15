package Models;

import java.time.LocalDateTime;

public class Base_Model {
    private Long id;
    private LocalDateTime CreateAt;
    private LocalDateTime UpdateAT;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getCreateAt() {
        return CreateAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        CreateAt = createAt;
    }

    public LocalDateTime getUpdateAT() {
        return UpdateAT;
    }

    public void setUpdateAT(LocalDateTime updateAT) {
        UpdateAT = updateAT;
    }
}
