{
 "cells": [
  {
   "cell_type": "code",
   "execution_count": 4,
   "id": "dad52352",
   "metadata": {},
   "outputs": [
    {
     "name": "stdout",
     "output_type": "stream",
     "text": [
      "LINHAS= 183\n",
      "COLUNAS= 275\n",
      "Acabou\n"
     ]
    }
   ],
   "source": [
    "import Imagem\n",
    "\n",
    "matriz = Imagem.getMatrizImagemCinza('olhos.jpg')\n",
    "\n",
    "\n",
    "print(\"LINHAS=\", len(matriz))\n",
    "print(\"COLUNAS=\", len(matriz[0]))\n",
    "\n",
    "for i in range(len(matriz)):\n",
    "    for j in range(len(matriz[0])):\n",
    "        if matriz[i][j] > 128:\n",
    "            matriz[i][j] = 255\n",
    "        else:\n",
    "            matriz[i][j] = matriz[i][j] - 64\n",
    "            if matriz[i][j] < 0:\n",
    "                matriz[i][j] = 0\n",
    "\n",
    "Imagem.salvaImagemCinza('olhos_modificado.jpg', matriz)                \n",
    "print(\"Acabou\")\n",
    "\n"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "id": "96444c1a",
   "metadata": {},
   "outputs": [],
   "source": []
  }
 ],
 "metadata": {
  "kernelspec": {
   "display_name": "Python 3 (ipykernel)",
   "language": "python",
   "name": "python3"
  },
  "language_info": {
   "codemirror_mode": {
    "name": "ipython",
    "version": 3
   },
   "file_extension": ".py",
   "mimetype": "text/x-python",
   "name": "python",
   "nbconvert_exporter": "python",
   "pygments_lexer": "ipython3",
   "version": "3.9.12"
  }
 },
 "nbformat": 4,
 "nbformat_minor": 5
}
