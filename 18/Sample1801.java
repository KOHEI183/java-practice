/*
 * ���d ���[�v�� �������z������� �T���v��
 * �쐬�FM.Takahashi
 */
class Sample1801 {
	public static void main(String[] args) {
		/*
		 * �z��Ɋi�[���ꂽ���Ȗ��i����A�Z���A�p��A���ȁA�Љ�j��
		 * �_�� (�e���Ȃ̓_��) ���u���Ȗ��F�_���v�̌`���ŕ\������
		 * ���̌�Ɍl�ʂ̍��v�ƕ��ς�\������B���ς� int �^
		 * �_���z��͂Q�����z��Ƃ���
		 * �R�l��(�͍�����A��������A�����)�̃f�[�^��ێ�����B
		 */
		// �z��E�ϐ��̐錾�E������
		String[] sub = {					// ���Ȗ�
			"����", "�Z��", "�p��", "����", "�Љ�", "���"
		};
		String[] person = {					// ��u��
			"�͍�", "����", "����"
		};
		int[][] score = {					// �_��
			{83, 77, 91, 68, 84},
			{78, 66, 81, 92, 59, 85},
			{94, 81, 79, 86, 79}
		};
		int total;							// �l�ʍ��v

		// �l������ for ���[�v
		for (int i = 0; i < score.length; i++) {
			total = 0;
			System.out.println("\n--�y" + person[i] + "����̓��_�z--");
			// ���Ȑ��� �� for ���[�v
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(				// ���ȁE�_���\��
					sub[j] + "�F" + score[i][j] + " "
				);
				total += score[i][j];			// ���v�ɉ��Z
			}
			// ���v�E���ς̕\��
			System.out.println("\n���v�F" + total);
			System.out.println("���ρF" + total / score[i].length);
		}
	}
}
