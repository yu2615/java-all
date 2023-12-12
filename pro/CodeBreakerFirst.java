package net.sougetu.first;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * CodeBreakerFirst<br>
 * �V���v����main���\�b�h�����ŃR�[�h�u���C�J�[���쐬���܂��B
 *
 * @author ono
 */
public class CodeBreakerFirst {

    /**
     * @param args
     */
    public static void main(String[] args) {
        //�ϐ��̏������B
        /*�K�v�ȕϐ�
         * �^�C�g���A���[�����A�����̊i�[�����z��A
         * ���͂��ꂽ�����̊i�[�����z��B
         * �q�b�g���A�u���[���A�`�������W�̉�
         */
        String title = "*** CodeBreaker ***";// �^�C�g��
        String rule = "�B���ꂽ3�̐��������Ă܂��B\n"
                    + "1�̐�����1����6�̊Ԃł��B\n"
                    + "3�̓����̒��ɓ��������͂���܂���B\n"
                    + "���͂��������́A"
                    + "�ʒu�Ɛ������������Ă���q�b�g�A\n"
                    + "�������������Ă���u���[�ƃJ�E���g���܂��B\n"
                    + "�S�����Ă���(3�Ƃ��q�b�g�ɂȂ�����)"
                    + "�I���ł�\n\n";
        int[] answer = new int[3];// ����������
        int[] input = new int[3];// ���͂�������������
        /*
         * hit��hit�̃J�E���g�p�Ablow��blow�̃J�E���g�p�B 
         * count�͉���ڂ̃`�������W���𐔂��Ă���B
         */
        int hit = 0, blow = 0, count = 0;

        //�^�C�g���ƃ��[���̕\��
        BufferedReader br 
            = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(title);
        System.out.println(rule);
        
        
        //�����_���ȓ������쐬�B
        //�������A�d�l�ʂ�A�����������Ȃ��悤�ɂ���B
        for (int i = 0; i < answer.length; i++) {
            //�������O�̗v�f�ɂ��Ԃ����Ȃ����m���߂�B
            //�����������1��random
            boolean flag = false;
            answer[i] = (int) (Math.random() * 6 + 1);
            do {
                flag = false;
                for (int j = i - 1; j >= 0; j--) {
                    if (answer[i] == answer[j]) {
                        flag = true;
                        answer[i] = (int) (Math.random() * 6 + 1);
                    }
                }

            } while (flag == true);
        }
        //�Q�[����
        while (true) {
            count++;
            System.out.println("*** "+count + "��� ***");
            //�C���v�b�g
            for (int i = 0; i < answer.length; i++) {
                System.out.print( (i + 1) + "�� : ");
                try {
                    input[i] = Integer.parseInt(br.readLine());
                } catch (NumberFormatException e) {
                    System.err.println("���l����͂��Ă�������");
                    i--;
                } catch (IOException e) {
                    System.err.println("������x���͂��Ă�������");
                    i--;
                }
            }
            //�������f
            hit = 0;
            blow = 0;
            for (int i = 0; i < answer.length; i++) {
                for (int j = 0; j < answer.length; j++) {
                    if (i == j && input[i] == answer[j]) {
                        hit++;
                    } else if (input[i] == answer[j]) {
                        blow++;
                    }
                }
            }
            //�I�����f�@�q�b�g��3�ɂȂ�����I��
            System.out.println("�q�b�g" + hit + " �u���[" + blow);
            if (hit == 3) {
                System.out.println("���߂łƁ[");
                break;
            }else{
                System.out.println();
            }
        }
    }
}