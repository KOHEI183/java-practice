/*
 * Sample1601.java
 * for �Ŕz������� �T���v��
 * �쐬�FM.Takahashi
 */
class Sample1601 {
	public static void main(String[] args) {
		/*
		 * �z��Ɋi�[���ꂽ���Ȗ��i����A�Z���A�p��j��
		 * �_�� (83, 77, 91) ���u���Ȗ��F�_���v�̌`���ŕ\������
		 * �Ō�ɍ��v�ƕ��ς�\������B���ς� int �^
		 */
		// �z��E�ϐ��̏�����
		String[] sub = {					// ���Ȗ�
			"����", "�Z��", "�p��", "����", "�Љ�"
		};
		int[] score = {83, 77, 91, 68, 84};			// �_��
		int total = 0;						// ���v

		// �J��Ԃ� (for - �z��)
		for (int i = 0; i < sub.length; i++) {
			System.out.println(				// ���ȁE�_���\��
				sub[i] + "�F" + score[i]
			);
			total += score[i];				// ���v�ɉ��Z
		}

		// �v�Z���ʂ̕\��
		System.out.println("----");
		System.out.println("���v�F" + total);
		System.out.println("���ρF" + total / sub.length);
	}
}
