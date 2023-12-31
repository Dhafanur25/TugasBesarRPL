package addOns;

import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TermsAndConditions extends JPanel{
        public TermsAndConditions() {
            JTextArea termsTextArea = new JTextArea("By using the "
                    + "YouthWellness app to schedule meetings with counselors "
                    + "for student mental health, you agree to the following "
                    + "terms and conditions:\n\n1. Purpose: The YouthWellness "
                    + "app is intended for scheduling meetings with counselors "
                    + "to address student mental health concerns.\n\n2. User "
                    + "Eligibility: Users must be a student to access and use "
                    + "the app.\n\n3. Confidentiality: All information shared "
                    + "during counseling sessions is strictly confidential. "
                    + "\n\n4. Responsibility: Users are responsible for "
                    + "providing accurate information when scheduling meetings "
                    + "and must adhere to the scheduled appointment times.\n\n"
                    + "5. Counselor Availability: While the app facilitates "
                    + "scheduling, counselor availability may vary. The app "
                    + "does not guarantee immediate or constant access to "
                    + "counseling services.\n\n6. Emergency Situations: In "
                    + "case of emergencies or immediate risk, users are "
                    + "instructed to contact local emergency services. The "
                    + "app is not a substitute for emergency intervention.\n\n"
                    + "7. User Conduct: Users must engage respectfully and "
                    + "responsibly in all communications within the app. Any "
                    + "abusive or inappropriate behavior may result in the "
                    + "termination of access.\n\n8. Technical Requirements: "
                    + "Users are responsible for ensuring that they have the "
                    + "necessary devices and internet connections to use the "
                    + "app effectively.\n\n9. Feedback: Users are encouraged "
                    + "to provide feedback on their experience with the app "
                    + "to help improve its functionality and services.\n\n10. "
                    + "Modification of Services: The app reserves the right to "
                    + "modify or discontinue services at any time without prior"
                    + " notice.\n\n11. Indemnification: Users agree to indemnify"
                    + " and hold harmless the YouthWellness app and its "
                    + "administrators from any claims, losses, or damages "
                    + "arising from their use of the app.\n\n12. Governing "
                    + "Law: These terms are governed by and construed in "
                    + "accordance with the laws of Indonesia's Jurisdiction."
                    + "\n\nBy using the YouthWellness app, you acknowledge "
                    + "that you have read, understood, and agree to be bound "
                    + "by these terms and conditions. If you do not agree with "
                    + "any part of these terms, please refrain from using the "
                    + "YouthWellness app.");
            termsTextArea.setEditable(false);
            termsTextArea.setLineWrap(true); 
            termsTextArea.setWrapStyleWord(true); 
            JScrollPane scrollPane = new JScrollPane(termsTextArea);
            scrollPane.setPreferredSize(new Dimension(400, 200));
            add(scrollPane);
        }
    }
