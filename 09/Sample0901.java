/*
 * �z��T���v��
 * �쐬�FM.Takahashi
 */
class Sample0901 {
	public static void main(String[] args) {
		// ���i���z��
		String[] item = new String[3];
		item[0] = "�{�[���y��";
		item[1] = "�m�[�g";
		item[2] = "�tⳎ�";

//		String[] item = {"�{�[���y��", "�m�[�g", "�tⳎ�"};

		// ���i�z��
		int[] price = { 75, 80, 95 };

		// �\��
		System.out.println(item[0] + "�F" + price[0] + "�~");
		System.out.println(item[1] + "�F" + price[1] + "�~");
		System.out.println(item[2] + "�F" + price[2] + "�~");
		System.out.println("----");
		System.out.println("���i���F" + item.length);
	}
}
