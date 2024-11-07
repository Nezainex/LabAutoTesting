Feature: Section Selection

  Scenario Outline: Selecting the specified section
    Given I open the medical services page
    When I select the "<sectionName>" section
    Then the "<sectionName>" section should be correctly selected

    Examples:
      | sectionName                         |
      | Patients                            |
      | Doctors                             |
      | Franchise                           |
      | Corporate Clients                   |
      | Press                               |
      | Analysis                            |
      | Appointment                         |
      | Doctors Link                        |
      | Promotions                          |
      | Addresses                           |
      | Medical Services                    |
      | Home Visit                          |
      | COVID-19                            |
      | Health Programs                     |
      | Checkup                             |
      | MRI                                 |
      | MRI Head                            |
      | MRI Internal Organs                 |
      | MRI Soft Tissues                    |
      | MRI During Pregnancy                |
      | MRI Peripheral Nervous System       |
      | MRI Mammary Glands                  |
      | MRI Spine                           |
      | MRI Joints                          |
      | MRI with Contrast                   |
      | Additional MRI Services             |
      | CT                                  |
      | CT Head                             |
      | CT with Contrast                    |
      | CT Spine                            |
      | CT Joints and Bones                 |
      | CT Internal Organs                  |
      | CT Soft Tissues                     |
      | Additional CT Services              |
      | X-Ray                               |
      | X-Ray Head                          |
      | X-Ray Body                          |
      | X-Ray Joints and Bones              |
      | Additional X-Ray Services           |
      | Densitometry                        |
      | Mammography                         |
      | Biopsy                              |
      | Aesthetic Gynecology                |
      | Otolaryngology                      |
      | HSG                                 |
      | Endoscopy                           |
      | Capsule Endoscopy                   |
      | Gastroscopy                         |
      | Colonoscopy                         |
      | Rectosigmoidoscopy                  |
      | Polypectomy                         |
      | Functional Diagnostics              |
      | Colposcopy                          |
      | Ultrasound                          |
      | Ultrasound During Pregnancy         |
      | Prostate Ultrasound                 |
      | Pediatric Ultrasound                |
      | Vascular Ultrasound                 |
      | Urinary System Ultrasound           |
      | Thyroid Ultrasound                  |
      | Abdominal Ultrasound                |
      | Pelvic Ultrasound                   |
      | Mammological Examination            |
      | Other Ultrasound Studies            |
      | Echocardiography                    |
      | Plasma Therapy                      |
      | Vaccination                         |
      | Injections                          |
      | IV Infusion                         |
      | IV Injection                        |
      | Intramuscular Injection             |
      | Subcutaneous Injection              |
      | Beauty Drips                        |
      | Phlebology                          |
      | Other Services                      |
      | Preparation for Tests               |
      | Biomaterial Acceptance Restrictions |
