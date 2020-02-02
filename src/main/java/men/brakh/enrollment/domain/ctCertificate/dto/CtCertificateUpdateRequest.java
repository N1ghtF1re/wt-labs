package men.brakh.enrollment.domain.ctCertificate.dto;

import lombok.*;
import men.brakh.enrollment.domain.UpdateDto;

@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class CtCertificateUpdateRequest extends BaseCtCertificateDto implements UpdateDto {
    private static final transient long serialVersionUID = 5586183491047715483L;

    @Builder
    public CtCertificateUpdateRequest(final Integer ctPoints,
                                    final String certificateId,
                                    final String certificateNumber,
                                    final String subject,
                                    final Integer year) {
        super(ctPoints, certificateId, certificateNumber, subject, year);
    }
}